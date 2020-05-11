package Backend.Model.Template;
import java.util.Random;
import Backend.Model.Builder.Kpversenyzo;

public abstract class Versenyez {
    
    Kpversenyzo versenyzo;
    Random rand = new Random();

    public Versenyez(Kpversenyzo versenyzo) {
        this.versenyzo = versenyzo;
    }

    public String Versenyzes() {
        String versenyutvonal = "";
        versenyutvonal += Start();
        versenyutvonal += Elindul();
        versenyutvonal += Eloz();
        versenyutvonal += Ugrat();
        versenyutvonal += Felzarkozik();
        versenyutvonal += Celbaer();
        return versenyutvonal;
    }

    private String Start() {
        return versenyzo.getNev() + " a " + versenyzo.getKerekpar() + " gyártó csapatához tartozik. Ö egy " + versenyzo.getKptipus() + " versenyző.\n Szeret sokat biciklizni és igen gyorsan tud vele menni ezért indul versenyeken.\n\n";
    }

    private String Elindul() {
        return "Elrajtol a verseny.\n";
    }

    private String Celbaer() {
        return "A versenyzőnk esés nélkül zárta a versenyt.";
    }

    protected abstract String Eloz();

    protected abstract String Ugrat();

    protected abstract String Felzarkozik();

    
    
    
}
