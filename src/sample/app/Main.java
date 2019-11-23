package sample.app;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.view.viewManager;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            viewManager manager = new viewManager();
            stage = manager.getMainStage();
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
