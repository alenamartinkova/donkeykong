package sample.view;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import sample.model.DonkeyMenuButton;

import java.util.ArrayList;
import java.util.List;

public class viewManager {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int MENU_START_X = 500;
    private static final int MENU_START_Y = 150;

    List<DonkeyMenuButton> menuButtons;


    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;


    public viewManager(){
        menuButtons = new ArrayList<>();
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        createButton();
        createMenuBackground();
    }

    private void addMenuButton(DonkeyMenuButton button) {
        button.setLayoutY(MENU_START_Y + menuButtons.size() * 100);
        button.setLayoutX(MENU_START_X);
        menuButtons.add(button);
        mainPane.getChildren().add(button);
    }

    private void createButton() {
        createStartButton();
        createScoreButton();
        createExitButton();
    }

    private void createStartButton() {
        DonkeyMenuButton startButton = new DonkeyMenuButton("START");
        addMenuButton(startButton);
    }

    private void createScoreButton() {
        DonkeyMenuButton scoreButton = new DonkeyMenuButton("SCORE");
        addMenuButton(scoreButton);
    }

    private void createExitButton() {
        DonkeyMenuButton exitButton = new DonkeyMenuButton("EXIT");
        addMenuButton(exitButton);
    }

    private void createMenuBackground() {
        Image backgroundImage = new Image("sample/view/bg.png", 800, 600, false,true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
        mainPane.setBackground(new Background(background));
    }

    public Stage getMainStage() {
        return mainStage;
    }
}
