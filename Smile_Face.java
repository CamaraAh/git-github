package smile_face;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Smile_Face extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        Circle circle = getCircle();
        pane.getChildren().add(circle);
        createEyes(pane);
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        return circle;
    }

    private void createEyes(StackPane pane) {

        Pane root = new Pane();
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Ellipse e1 = new Ellipse(100, 90, 25, 15);
        Ellipse e2 = new Ellipse(200, 90, 25, 15);
        e1.setStroke(Color.BLACK);
        e2.setStroke(Color.BLACK);
        e1.setFill(Color.WHITE);
        e2.setFill(Color.WHITE);
        circle1.setCenterX(100);
        circle1.setCenterY(90);
        circle1.setRadius(10);

        circle2.setCenterX(200);
        circle2.setCenterY(90);
        circle2.setRadius(10);
        Arc arc = getArc();
        Line line1 = createLine1();
        Line line2 = createLine2();
        Line line3 = createLine3();
        root.getChildren().addAll(e1, e2, circle1, circle2, arc, line1,line2,line3);
        pane.getChildren().add(root);
    }

    private Arc getArc() {

        Arc arc = new Arc();
        arc.setCenterX(150);
        arc.setCenterY(180);
        arc.setRadiusX(50);
        arc.setRadiusY(20);
        arc.setStartAngle(0);
        arc.setLength(-180);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        return arc;
    }

    private Line createLine1() {

        Line line1 = new Line();
        line1.setStartX(150);
        line1.setStartY(90);
        line1.setEndX(100);
        line1.setEndY(150);
        return line1;

    }

    private Line createLine2() {
        Line line2 = new Line();
        line2.setStartX(150);
        line2.setStartY(90);
        line2.setEndX(190);
        line2.setEndY(150);
        return line2;
    }

    private Line createLine3() {
        Line line3 = new Line();
        line3.setStartX(100);
        line3.setStartY(150);
        line3.setEndX(190);
        line3.setEndY(150);
        return line3;
    }

}
