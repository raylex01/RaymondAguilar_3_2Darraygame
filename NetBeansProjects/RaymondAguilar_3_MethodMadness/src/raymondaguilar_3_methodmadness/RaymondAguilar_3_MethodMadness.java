/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondaguilar_3_methodmadness;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author raylex01
 */
public class RaymondAguilar_3_MethodMadness extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        drawHouse(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    private void drawHouse(GraphicsContext gc) {
    gc.fillText("", 42, 42);
    
    }
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        gc.strokeRect(190, 230, 90, 90);
        gc.strokeLine(190, 320, 235, 350);
        gc.strokeLine(280, 320, 235, 350);
        gc.strokeRect(215, 230, 30, 30);
        gc.strokeRect(200, 280, 20, 20);
        gc.strokeRect(245, 280, 20, 20);
        gc.setLineWidth(3);
        gc.strokeOval(220, 240, 5, 5);
        gc.setLineWidth(4);
        gc.strokeRect(245, 280, 10, 10);
        gc.strokeRect(255, 290, 10, 10);


    }
                }
        
        
       
