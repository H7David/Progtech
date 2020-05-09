package Backend.Model.Builder;

public class Kpversenyzo {
    String kerekpargyarto;
    String nev;
    String kptipus;

    /**
     * Visszaadja a kerékpárgyártó nevét
     *
     * @return string
     */
    public String getKerekpar() {
        return this.kerekpargyarto;
    }

    /**
     * Visszaadja a versenyző nevét
     *
     * @return string
     */
    public String getNev() {
        return this.nev;
    }

    /**
     * Visszaadja a versenyző kp. fajtáját
     *
     * @return string
     */
    public String getKptipus() {
        return this.kptipus;
    }

    public Kpversenyzo() {
        kerekpargyarto = "";
        nev = "";
        kptipus = "";
    }

    /**
     * A versenyző kptipusát állítja be.
     *
     * @param kptipus Egy string paraméterrel beállítja a versenyző kptipusát.
     */
    public void setKptipus(String kptipus) {
        if (kptipus != "") {
            this.kptipus = kptipus;
        }
    }

    /**
     * A versenyzó kerekpargyartoját állítja be.
     *
     * @param kerekpargyarto Egy string paraméterrel beállítja a versenyző kerekpargyartoját.
     */
    public void setKerekpargyarto(String kerekpargyarto) {
        if (kerekpargyarto != "") {
            this.kerekpargyarto = kerekpargyarto;
        }
    }

    /**
     * A versenyző nevét állítjuk be.
     *
     * @param nev Egy string paraméterrel beállítja a versenyző nevét.
     */
    public void setNev(String nev) {
        if (nev != "") {
            this.nev = nev;
        }
    }
}
