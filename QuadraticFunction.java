/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticfunction;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Mr Camara Ahmed
 */
public class QuadraticFunction extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        pane.getChildren().add(polyline);
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(scaleFactor * x * x);
        }
         Line lineX = new Line(10, 200, 400, 200);
         Line lineY = new Line(lineX.getEndX() / 2, 10, lineX.getEndX() / 2, 400);
         pane.getChildren().addAll(lineX, lineY);

         Polyline arrowX = new Polyline();
         Text X = new Text(408, 198, "X");
         ObservableList<Double> xlist = arrowX.getPoints();
         pane.getChildren().addAll(arrowX, X);
         xlist.addAll(
         lineX.getEndX() - 20, lineY.getEndY() / 2 - 10,
         lineX.getEndX(), 200.0,
         lineX.getEndX() - 20, 210.0
         );

         Polyline arrowY = new Polyline();
         ObservableList<Double> ylist = arrowY.getPoints();
         Text Y = new Text(lineX.getEndX() / 2 + 10, 20, " Y ");
         pane.getChildren().addAll(arrowY, Y);
         ylist.addAll(
         lineX.getEndX() / 2 - 10, 35.0,
         lineX.getEndX() / 2, 10.0,
         lineX.getEndX() / 2 + 10, 35.0
         );

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Quadratic Function");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
