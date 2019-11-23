package exercise_14.pkg7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
public class Exercise_147 extends Application {
    
    @Override
    public void start(Stage s) {
        
        GridPane pane = new GridPane();
        boolean isFill = false;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                
                TextField text = new TextField();
                text.setPrefColumnCount(1);
                text.setStyle("-fx-border-color : black;");
                if(isFill == false)
                    text.setText("1");
                else if(isFill == true)
                    text.setText("0");
                
                pane.add(text, i, j);
                isFill = !isFill;
            }
            isFill = !isFill;
        }
        Scene scene = new Scene(pane,300,250);
        s.setScene(scene);
        s.setResizable(false);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
