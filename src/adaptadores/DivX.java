package adaptadores;

/**
 *
 * @author jmartinezpineiro
 */
public class DivX implements MediaDivX {

    @Override
    public void playFilm(String filename) {
        System.out.println("Playing DivX File " + filename);
    }
    
}
