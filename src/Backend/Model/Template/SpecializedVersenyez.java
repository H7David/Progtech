package Backend.Model.Template;

import Backend.Model.Builder.Kpversenyzo;
public class SpecializedVersenyez extends Versenyez {

    
    public SpecializedVersenyez(Kpversenyzo versenyzo) {
        super(versenyzo);
    }
    @Override
    protected String Eloz() {
         return versenyzo.getNev() + " Megelőzte az ellenfél Scott versenzőjét.\n";
    }

    @Override
    protected String Ugrat() {
         return versenyzo.getNev() + " átugratott egy autót.\n";
    }

    @Override
    protected String Felzarkozik() {
        return versenyzo.getNev() + " Felzárkózott a Specialized csapathoz.\n";
    }
    
}
