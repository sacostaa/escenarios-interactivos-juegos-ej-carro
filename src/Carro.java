/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Carro extends Objeto{
    
    private Chasis chasis;
    private Llanta llanta;

    public Carro(int x, int y) {
        super(x, y);
        this.llanta = new Llanta (x,y);
        this.chasis = new Chasis (x,y);
    }
    
    

    @Override
    public void mover() {
        
        this.x = x +1;
        this.y = y;
    
    
    
    
}
}