package distance_circles;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Distance_Circles extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 400);
        Circle circle = new Circle();
        getCircle(pane);
        primaryStage.setTitle("Distance Between two Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void getCircle(Pane pane) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        DoubleProperty radius = new SimpleDoubleProperty();
        radius.setValue(20.0);

        circle1.centerXProperty().bind(pane.widthProperty().divide(6));
        circle1.centerYProperty().bind(pane.heightProperty().divide(4));
        circle1.radiusProperty().bind(radius);
        
        
        circle2.centerXProperty().bind(pane.widthProperty().divide(2));
        circle2.centerYProperty().bind(pane.heightProperty().divide(2));
        circle2.radiusProperty().bind(radius);
        
        Line line = new Line();
        line.startXProperty().bind(circle1.centerXProperty());
        line.startYProperty().bind(circle1.centerYProperty());
        line.endXProperty().bind(circle2.centerXProperty());
        line.endYProperty().bind(circle2.centerYProperty());
        line.setStroke(Color.BLACK);
        double X1 = circle2.getCenterX() - circle1.getCenterX();
        double X2 = circle2.getCenterY() - circle1.getCenterY();
        double dis = Math.sqrt((X1 * X1) + (X2 * X2));
        double distance = dis - (circle2.getRadius() + circle1.getRadius());
        Text txt = new Text("Distance : "+String.valueOf(distance));
        txt.xProperty().bind(pane.widthProperty().divide(4));
        txt.yProperty().bind(pane.heightProperty().divide(4));
        
        pane.getChildren().addAll(circle1, circle2,line,txt);

    }

}
