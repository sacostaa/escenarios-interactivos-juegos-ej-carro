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
    public void moverd() {
        this.x = x + 1;
    }

    @Override
    public void moveri() {
        this.x = x - 1;
    }

    @Override
    public void movera() {
        this.y = y + 1;
    }

    @Override
    public void moverb() {
        this.y = y - 1;
    }
}