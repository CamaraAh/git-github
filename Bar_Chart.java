package bar_chart;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Bar_Chart extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Pane pane = new Pane();
       pane.setPadding(new Insets(10,10,0,10));
       Rectangle rec = getRectangle1();
       Text txt1 = new Text(12,410,"PROJECT --20%");
       Text txt2 = new Text(127,440,"QUIZ --10%");
       Text txt3 = new Text(242,335,"MIDTERM --30%");
       Text txt4 = new Text(364,195,"FINAL --40%");
       Rectangle rectangle1 = new Rectangle(125,450,100,100);
       rectangle1.setFill(Color.BLACK);
       Rectangle rectangle2 = new Rectangle(240,340,100,600);
       rectangle2.setFill(Color.ORANGE);
       Rectangle rectangle3 = new Rectangle(360,200,100,600);
       rectangle3.setFill(Color.GREEN);
       
       pane.getChildren().addAll(rec,txt1,rectangle1,txt2,rectangle2,txt3,rectangle3,txt4);
       Scene scene = new Scene(pane,700,500);
       primaryStage.setScene(scene);
       primaryStage.setResizable(false);
       primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    private Rectangle getRectangle1() {
        
        Rectangle rectangle = new Rectangle(10,420,100,100);
        rectangle.setFill(Color.RED);
       
        return rectangle;
    }
    
}
