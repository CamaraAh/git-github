package exercise_144_c;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class Exercise_144_c extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        boolean isBlack = false;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                
                Rectangle rec = new Rectangle(50,50, (isBlack) ? Color.BLACK : Color.WHITE);
                pane.add(rec, i, j);
                isBlack = !isBlack;
            }
            isBlack = !isBlack;
        }
        Scene scene = new Scene(pane, 400, 350);
        primaryStage.setTitle("checkerboard");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
