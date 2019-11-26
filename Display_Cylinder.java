package display_cylinder;

import javafx.application.Application;
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
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Mr Camara Ahmed
 */
public class Display_cylinder extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        Pane rootr = new Pane();
        Line line1 = new Line(50, 80, 50, 300);
        Line line2 = new Line(150, 80, 150, 300);
        Ellipse e = new Ellipse(100, 80, 50, 20);
        e.setStroke(Color.BLACK);
        e.setFill(Color.WHITE);
        Arc arc1 = new Arc(100, 300, 50, 20, 0, -180);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.BLACK);
        arc1.setFill(Color.WHITE);
        Arc arc2 = new Arc(100, 290, 50, 20, 0, 180);
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);
        arc2.getStrokeDashArray().addAll(6.0, 21.0);
        root.getChildren().addAll(line1, line2, e, arc1, arc2);
        Scene scene = new Scene(root,600,500);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Ellipse getEllipse() {
        //
        //100,100,80,50
        Ellipse e1 = new Ellipse(75, 40, 50, 20);
        e1.setFill(Color.WHITE);
        e1.setStroke(Color.BLACK);
        return e1;
    }

    private void getRectangle(StackPane pane) {
        Rectangle rec = new Rectangle(100, 0, 140, 50);
        rec.setFill(Color.WHITE);
        rec.setStroke(Color.BLACK);
        pane.getChildren().add(rec);
    }

}
