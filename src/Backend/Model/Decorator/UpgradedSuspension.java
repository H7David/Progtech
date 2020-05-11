/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Model.Decorator;

/**
 *
 * @author prog
 */
public class UpgradedSuspension implements Bikes{

    
     Bikes bikes;

    public UpgradedSuspension(Bikes bikes) {
        this.bikes = bikes;
    }
    @Override
    public String upgrade() {
       return bikes.upgrade()+"Fejlesztve lettek a teleszkópok";
    }

    @Override
    public int ar() {
        return bikes.ar()+ 80000;
    }
    
}
