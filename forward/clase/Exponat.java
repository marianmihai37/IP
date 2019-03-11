import java.util.Vector;
import java.time.LocalTime;

public abstract class Exponat {

  public String denumire;

  public String autor;

  public LocalTime dataRealizare;

  public Integer dimensiune;

    public Vector  myVizitator;
    public Vector  Vizualizare;
    public GalerieMultimedia myGalerieMultimedia;
    public Vector  PanelAdministrare;
    /**
   * 
   * @element-type Vizitator
   */

 
  public void alegeAutor() {
  }

  public void preiaGalerieImagini() {
  }

  public void afisareExponat() {
  }

}