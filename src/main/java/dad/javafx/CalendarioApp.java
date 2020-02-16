package dad.javafx;

import dad.javafx.calendario.CalendarioController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalendarioApp extends Application {

	private CalendarioController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new CalendarioController();
		
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setTitle("Calendario");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
