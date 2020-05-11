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
public abstract class Kerekpar {
    
    public Kerekpar(){}
    public Kerekpar(String gyarto, String tipus, int kerekmeret){
    this.gyarto=gyarto;
    this.tipus=tipus;
    this.kerekmeret=kerekmeret;
    
    }
   /*    public Kerekpar(Kerekpar kerekpar){
    this.gyarto=kerekpar.gyarto;
    this.tipus=kerekpar.tipus;
    this.kerekmeret=kerekpar.kerekmeret;
    
    
    }*/
    public abstract Object copy();
    
    
    
    private String gyarto;
    private String tipus;
    private int kerekmeret;
 
    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getGyarto() {
        return gyarto;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    
   

    /**
     * Get the value of tipus
     *
     * @return the value of tipus
     */
    public String getTipus() {
        return tipus;
    }

    /**
     * Set the value of tipus
     *
     * @param tipus new value of tipus
     */
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    
       

    /**
     * Get the value of kerekmeret
     *
     * @return the value of kerekmeret
     */
    public int getKerekmeret() {
        return kerekmeret;
    }

    /**
     * Set the value of kerekmeret
     *
     * @param kerekmeret new value of kerekmeret
     */
    public void setKerekmeret(int kerekmeret) {
        if (kerekmeret>=10&&kerekmeret<=30 )
        {this.kerekmeret = kerekmeret;}
        else{throw new IllegalStateException("A kerekmeretnek 10 és 30 között kell lennie!");}
    }



    
}
