package tugas.akhir;

import javafx.application.Application;
import javafx.stage.Stage;
import tugas.akhir.scene.FrontScene;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("MyCalculator");
        stage.setResizable(false);
        FrontScene frontScene = new FrontScene(stage);
        frontScene.display();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
