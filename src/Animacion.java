

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import java.util.*;


public class Animacion extends AnimationTimer{
    private Carro carro;
    private ArrayList<Obstaculo> obstaculos;
    private GraphicsContext lapiz;
    private Image fondo = null;
    private Image ufo = null;
    private int secuencia = 0;
    private int f = 0;

    public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro (0,100);
        this.obstaculos = new ArrayList <Obstaculo>();
        fondo = new Image ("images/fondo.png");
        ufo = new Image ("images/ufo_"+secuencia+".png");
        
    }
    
  
    
    
    

    @Override
    public void handle(long l) {
        
        
        if (5>f) {
            f++;
            
        }else{
            secuencia = secuencia++;
        }
        if (f>6) {
                f= 0;
                
            }
         
        lapiz.clearRect(0, 0, 1024, 512);
        lapiz.drawImage(fondo, 0, 0);
        lapiz.drawImage(ufo, this.carro.getX(), this.carro.getY()+200);
       lapiz.strokeLine(0, 150, 300, 150);
       lapiz.setFill(Color.DARKGRAY);
       lapiz.drawImage(fondo, l, l);
       lapiz.fillRect(this.carro.getX(),this.carro.getY()-5, 60, 35 );
       lapiz.fillOval(this.carro.getX()+7,this.carro.getY()+30 , 20, 20);
       lapiz.fillOval(this.carro.getX()+35,this.carro.getY()+30 , 20, 20);
       lapiz.setFill(Color.RED);
       lapiz.fillRect(230, 0, 80, 15);
       lapiz.setFill(Color.CHOCOLATE);
       
        
       
       lapiz.fillRect(100, 120, 30, 30);
       lapiz.fillRect(150, 120, 30, 30);
       lapiz.fillRect(200, 120, 30, 30);
       
       
       Shape carro = new Rectangle(this.carro.getX(), this.carro.getY()-5, 60, 55); 
       Shape obs1 = new Rectangle(100, 120, 30, 30);
       Shape obs2 = new Rectangle(150, 120, 30, 30);
       Shape obs3 = new Rectangle(200, 120, 30, 30);
       Shape inter1 = SVGPath.intersect(carro, obs1);
       Shape inter2 = SVGPath.intersect(carro, obs2);
       Shape inter3 = SVGPath.intersect(carro, obs3);
       
       

       
            
        
    }
    
}
