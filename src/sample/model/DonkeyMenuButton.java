package sample.model;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class DonkeyMenuButton extends Button {
    private final String FONT_PATH = "sample/model/Calistoga-Regular.ttf";
    private final String BUTTON_STYLE = "-fx-background-color: red;";

    public DonkeyMenuButton(String text) {
         setText(text);
         setButtonFontStyle();
         setPrefWidth(180);
         setPrefHeight(51);
         setStyle(BUTTON_STYLE);
         initButtonListeners();
    }

    private void setButtonReleasedStyle() {
         setStyle(BUTTON_STYLE);
         setLayoutY(getLayoutY());
    }

    private void setButtonFontStyle() {
         try {
             setFont(Font.loadFont(new FileInputStream(FONT_PATH), 23));
         } catch (FileNotFoundException e){
            setFont(Font.font("Verdana",23));
         }
    }

    private void initButtonListeners() {
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                    setButtonReleasedStyle();
                }
            }
        });

         setOnMouseReleased(new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent mouseEvent) {
                 if(mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                     setButtonReleasedStyle();
                 }
             }
         });

         setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                setEffect(new DropShadow());
            }
        });

         setOnMouseExited(new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent mouseEvent) {
                 setEffect(null);
             }
         });
    }
}
