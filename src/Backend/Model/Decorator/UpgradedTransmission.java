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
public class UpgradedTransmission implements Bikes {
    
    Bikes bikes;

    public UpgradedTransmission(Bikes bikes) {
        this.bikes = bikes;
    }
    
    

    @Override
    public String upgrade() {
        return bikes.upgrade()+ "A biciglin fejlesztve letta váltó.";
    }

    @Override
    public int ar() {
         return bikes.ar()+ 30000;
    }

   
}
