package Backend.Model.Builder;

import java.util.logging.Logger;

public class KpversenyzoBuilder {
    private Kpversenyzo versenyzo;
    
    /**
     * Beállíthatjuk a versenyző nevét.
     *
     * @param nev string
     * @return Az adott versenyző nevét adja vissza.
     */
    public KpversenyzoBuilder SetNev(String nev) {
        this.versenyzo.setNev(nev);
        return this;
    }
    private static final Logger LOG = Logger.getLogger(KpversenyzoBuilder.class.getName());

    /**
     * Beállíthatjuk a versenyző kp,gyártóját.
     *
     * @param kerekpargyarto string
     * @return Az adott versenyzőnek a kp.gyartojat adja vissza.
     */
    public KpversenyzoBuilder SetKerekpargyarto(String kerekpargyarto) {
        this.versenyzo.setKerekpargyarto (kerekpargyarto);
        return this;
    }

    /**
     * Beállíthatjuk a karakter ruha színét.
     *
     * @param kptipus string
     * @return Az adott karakter ruha színét adja vissza.
     */
    public KpversenyzoBuilder SetKptipus(String kptipus) {
        this.versenyzo.setKptipus(kptipus);
        return this;
    }

    /**
     * Létrehozza a példányt.
     *
     * @return Egy versenyző példány.
     */
    public Kpversenyzo Build() {
        LOG.info("A versenyző buildelése sikeres.");
        return versenyzo;
    }

    public KpversenyzoBuilder() {
        this.versenyzo = new Kpversenyzo();
    }
    
    
    
    
    
    
    
}
