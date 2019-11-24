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
        ArrayList<Integer> list = new ArrayList<>();
        GridPane pane = new GridPane();
        Insets ins = new Insets(10, 10, 10, 10);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(ins);
        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }
        int card = 1;
        java.util.Collections.shuffle(list);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {

                Image im = new Image("/image/" + (card++) + ".png");
                ImageView im1 = new ImageView(im);
                pane.add(im1, j, i);

            }

        }
        Scene scene = new Scene(pane);
        s.setScene(scene);
        s.setResizable(false);
        s.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
