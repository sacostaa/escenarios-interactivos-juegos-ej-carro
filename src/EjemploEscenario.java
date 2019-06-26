

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javafx.stage.Stage;
        
        
public  class EjemploEscenario extends Application{
    
    public static void main(String[] args) {
        
        Application.launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
         VBox layoutprincipal = new VBox();
         HBox fila1 = new HBox();
         
        Canvas tablero = new Canvas (1024,512);
        panel.getChildren().add(tablero);
        Button ba = new Button ("adelante");
        Button br = new Button ("reversa");
        fila1.getChildren().add(ba);
        fila1.getChildren().add(br);
                
        
        
        GraphicsContext lapiz = tablero.getGraphicsContext2D();
        Animacion animacion = new Animacion(lapiz);
        animacion.start();
        layoutprincipal.getChildren().add(panel);
        layoutprincipal.getChildren().add(fila1);
        Scene escena = new Scene (layoutprincipal,1024,512,Color.WHITESMOKE);
        stage.setScene(escena);
        stage.setTitle("titulo 1");
        stage.show();
        
    }
    
   
    
    
}
