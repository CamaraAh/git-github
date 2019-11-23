package card_insertion;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;

public class Card_Insertion extends Application {
    
    @Override
    public void start(Stage s) {
        ArrayList <Integer>list = new ArrayList<>(); 
        GridPane pane = new GridPane();
        Insets ins = new Insets(10,10,10,10);
        pane.setHgap(10);
        pane.setPadding(ins);
        for(int i = 1; i <= 52; i++){
            list.add(i);
        }
        java.util.Collections.shuffle(list);
        Image im1 = new Image("/image/"+list.get(0)+".png");
        Image im2 = new Image("/image/"+list.get(1)+".png");
        Image im3 = new Image("/image/"+list.get(2)+".png");
        ImageView im = new ImageView(im1);
        pane.add(im, 0, 0);
        im = new ImageView(im2);
        pane.add(im, 2, 0);
        im = new ImageView(im3);
        pane.add(im, 4, 0);
        Scene scene = new Scene(pane,400,180);
        s.setScene(scene);
        s.setResizable(false);
        s.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
