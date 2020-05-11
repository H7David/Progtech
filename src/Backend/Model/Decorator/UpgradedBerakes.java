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
public class UpgradedBerakes implements Bikes {

    Bikes bikes;
   
 public UpgradedBerakes(Bikes bikes) {
        this.bikes = bikes;
    }

@Override
    public String upgrade() {
       
        return bikes.upgrade()+ "A biciglin fejlesztve lettek a fékek.";
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ar() {
     return bikes.ar()+ 40000; //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
