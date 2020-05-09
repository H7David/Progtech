package Backend.Model.Template;

import Backend.Model.Builder.Kpversenyzo;
public class ScottVersenyez extends Versenyez {

     public ScottVersenyez(Kpversenyzo versenyzo) {
        super(versenyzo);
    }
    @Override
    protected String Eloz() {
        return versenyzo.getNev() + " Megelőzte az ellenfél Specialized versenzőjét.\n";
    }

    @Override
    protected String Ugrat() {
      return versenyzo.getNev() + " Átugratott 3 motort.\n";
    }

    @Override
    protected String Felzarkozik() {
        return versenyzo.getNev() + " Felzárkózott a Scott csapathoz.\n";
    }
    
}
