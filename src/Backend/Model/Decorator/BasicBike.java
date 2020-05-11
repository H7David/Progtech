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
public class BasicBike implements Bikes {

    @Override
    public String upgrade() {
        return "Alap kerékpár.";
    }

    @Override
    public int ar() {
       return 100000;
    }
    
}
