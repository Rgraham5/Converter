import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	private final int WIDTH = 475, HEIGHT = 175;
	private WeightConverter weight;
	
	public void start(Stage stage) {
		weight = new WeightConverter();
		VBox root = new VBox(weight);
		
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
