/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Model.Prototype;

/**
 *
 * @author prog
 */
public class DHKpPrototype extends Kerekpar {

   /* public DHKpPrototype(){}
    
   /* public DHKpPrototype(String gyarto, String tipus, int kerekmeret){
    super(gyarto);
    super(tipus);
    super(kerekmeret);
    }*/
   
    public DHKpPrototype(/*DHKpPrototype kerekpar,*/ int rugout ){
    //super(kerekpar);
  //  this.tipus= kerekpar.getTipus();
    //this.gyarto= kerekpar.getGyarto();
    //this.kerekmeret=kerekpar.getKerekmeret();
    this.rugout=rugout;
    
    }
            
   /* private String gyarto;
    private String tipus;
    private int kerekmeret;*/
    private int rugout;

    /**
     * Get the value of rugout
     *
     * @return the value of rugout
     */
    public int getRugout() {
        return rugout;
    }

    /**
     * Set the value of rugout
     *
     * @param rugout new value of rugout
     */
    public void setRugout(int rugout) {
        this.rugout = rugout;
    }

    
    
    
    
    @Override
    public Kerekpar copy() {       
        return new DHKpPrototype(getRugout());
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
