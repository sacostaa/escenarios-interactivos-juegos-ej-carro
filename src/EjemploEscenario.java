

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;
        
        
public  class EjemploEscenario extends Application{
    
    public static void main(String[] args) {
        
        Application.launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
        Canvas tablero = new Canvas (300,300);
        panel.getChildren().add(tablero);
        Scene escena = new Scene (panel,300,300,Color.WHITESMOKE);
        GraphicsContext lapiz = tablero.getGraphicsContext2D();
        Animacion animacion = new Animacion(lapiz);
        animacion.start();
        stage.setScene(escena);
        stage.setTitle("titulo 1");
        stage.show();
        
    }
    
   
    
    
}
