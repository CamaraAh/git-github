package exercise_14.pkg1_a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Exercise_141_a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        Insets ins = new Insets(10,10,10,10);
        pane.setPadding(ins);
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        Image image1 = new Image("/image/flaglondon.gif");
        ImageView imageview1 = new ImageView(image1);
        Image image2 = new Image("/image/canada.jpg");
        ImageView imageview2 = new ImageView(image2);
        Image image3 = new Image("/image/china.gif");
        ImageView imageview3 = new ImageView(image3);
        
        Image image4 = new Image("/image/america.gif");
        ImageView imageview4 = new ImageView(image4);
        pane.add(imageview1, 0, 0);
        pane.add(imageview2, 4, 0);
        pane.add(imageview3, 0, 4);
        pane.add(imageview4, 4, 4);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FLAGS");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
