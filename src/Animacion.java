
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;


public class Animacion extends AnimationTimer{
    private Carro carro;
    private GraphicsContext lapiz;

    public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro (0,100);
    }

    
    
    

    @Override
    public void handle(long l) {
        lapiz.clearRect(0, 0, 300, 300);
       lapiz.strokeLine(0, 200, 300, 200);
       lapiz.fillRect(this.carro.getX(),this.carro.getY(), 40, 40 );
       this.carro.mover();
            
        
    }
    
}
