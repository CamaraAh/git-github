package exercise_14.pkg4_a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Exercise_144_a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setVgap(5);
        pane.setHgap(5);
        pane.setAlignment(Pos.CENTER);
        pane.setOrientation(Orientation.VERTICAL);
        Label label = new Label("javaFx");
        Label label2 = new Label("javaFx");
        Label label3 = new Label("javaFx");
        Label label4 = new Label("javaFx");
        Label label5 = new Label("javaFx");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
        label2.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
        label3.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
        label4.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
        label5.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
        pane.getChildren().addAll(label,label2,label3,label4,label5);
         pane.setRotate(90);
        Scene scene = new Scene(pane,160,150);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
