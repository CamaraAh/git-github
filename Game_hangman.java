package game_hangman;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Game_hangman extends Application {   
    @Override
    public void start(Stage primaryStage){
        Circle circle = new Circle();
        Pane pane = new Pane();
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setRadius(20);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        drawLineAndArc(pane);
        pane.getChildren().addAll(circle);
        Scene scene = new Scene(pane,800,800);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    private void drawLineAndArc(Pane pane) {
        
        Polyline polyline1 = new Polyline();
        polyline1.setStroke(Color.BLACK);
        ObservableList<Double>list1 = polyline1.getPoints();
        double x1 = 400.0,
                x2 = 200.0;
        double y1 = 375.0,
                y2 = 200.0,
                y3 = 600.0;;
        list1.addAll(
                x1,y1,
                x1,y2,
                x2,y2,
                x2,y3
        );       
        Polyline polyline2 = new Polyline();
        ObservableList<Double> list2 = polyline2.getPoints();
        polyline2.setStroke(Color.BLACK);       
        list2.addAll(
                400.0,425.0,
                400.0,600.0,
                450.0,650.0
        );       
        Polyline polyline3 = new Polyline();
        ObservableList<Double>list3 = polyline3.getPoints();
        list3.addAll(
                380.0,400.0,
                350.0,450.0
        );
        Polyline polyline4 = new Polyline();
        ObservableList<Double>list4 = polyline4.getPoints();
        list4.addAll(
                400.0,600.0,
                350.0,650.0
        );
        Polyline polyline5 = new Polyline();
        ObservableList<Double>list5 = polyline5.getPoints();
        list5.addAll(
                415.0,400.0,
                450.0,460.0
        );
        
        Arc arc = new Arc();
        arc.setCenterX(200);
        arc.setCenterY(600);
        arc.setType(ArcType.OPEN);
        arc.setStartAngle(0);
        arc.setLength(180);
        arc.setRadiusX(30);
        arc.setRadiusY(5);
        arc.setStroke(Color.BLACK);
        arc.setFill(Color.WHITE);
        pane.getChildren().addAll(polyline1,polyline2,polyline3,polyline4,polyline5,arc);
    }
    
}
