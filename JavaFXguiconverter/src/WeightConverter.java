//package Converter;

public class WeightConverter extends ConverterPane {
	
	private String title = "Weight Converter";
    //Metric conversion to standard conversion//
	private String[] options = {
			"oz - Ounce",
			"kg - Kilogram", 
			"lb - Pound"
	};

	private String fromUnit;
	private String toUnit;
	private String fromValue;
	
	public WeightConverter() {
		setTitle(title);
		setOptions(options);
		
		button.setOnMouseClicked(event -> {
			
			fromUnit = getFromUnit();
			toUnit = getToUnit();
			fromValue = getValueFrom();
			double value;
			double meterLength;
			double result;
			try {
				value = Double.parseDouble(fromValue);
				if ((meterLength = convertToGram(value, fromUnit)) >= 0) {
					result = convertToUnit(meterLength, toUnit);
					textOut.setText("" + df.format(result));
				} else {
					textOut.setText("You don't weight less than nothing!");
				}
			} catch (NumberFormatException e) {
				textOut.setText("Insuffiecient Value");
			}
		});
	}
	
	private double convertToGram(double value, String fromUnit) {
		double result = 0;
		switch (fromUnit) {
		case "kg":
			result = value * 1000;
			break;
		case "oz":
			result = value * 28.3;
			break;
		case "lb":
			result = value * 453.6;
			break;
            //Rounded to nearest tenth//
	
            //Rounded to nearest tenth//
		default:
			textOut.setText("No such unit of measurement exists for Weight");
		}
		return result;
	}	
	
	private double convertToUnit(double value, String toUnit) {
		double result = 0;
		switch(toUnit) {
		case "kg":
			result = value / 1000;
			break;
		
		case "oz":
		result = value / 28.3;
		break;
		
		case "lb":
			result = value / 453.6;
			break;
	}
		return result;
	}
}