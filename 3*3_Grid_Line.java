package line_gridpane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Line_GridPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);
        boolean verify = true;
        int divider = 2;
        int scale = 80;
        for (int i = 0; i < 2; i++) {
            Line line = new Line();

            if (verify == true) {

                line.setStroke(Color.RED);
                line.startXProperty().bind(pane.widthProperty().divide(divider).add(scale));
                line.startYProperty().bind(pane.layoutYProperty());
                line.endXProperty().bind(pane.widthProperty().divide(divider).add(scale));
                line.endYProperty().bind(pane.heightProperty());
                verify = !verify;
            } else if (verify == false) {

                line.setStroke(Color.RED);
                line.startXProperty().bind(pane.widthProperty().divide(divider).subtract(scale));
                line.startYProperty().bind(pane.layoutYProperty());
                line.endXProperty().bind(pane.widthProperty().divide(divider).subtract(scale));
                line.endYProperty().bind(pane.heightProperty());
            }

            pane.getChildren().add(line);
        }
        verify = true;
        for (int i = 0; i < 2; i++) {
            
            Line line = new Line();
            line.setStroke(Color.GREEN);
            if(verify == true){
                line.startXProperty().bind(pane.layoutXProperty());
                line.startYProperty().bind(pane.heightProperty().divide(divider).subtract(scale));
                line.endXProperty().bind(pane.widthProperty());
                line.endYProperty().bind(pane.heightProperty().divide(divider).subtract(scale));
                verify =! verify;
            }
            
            else if(verify == false){
                line.startXProperty().bind(pane.layoutXProperty());
                line.startYProperty().bind(pane.heightProperty().divide(divider).add(scale));
                line.endXProperty().bind(pane.widthProperty());
                line.endYProperty().bind(pane.heightProperty().divide(divider).add(scale));
            }
             pane.getChildren().add(line);
        }
        System.out.println("Pane : " + pane.widthProperty().getValue());
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
