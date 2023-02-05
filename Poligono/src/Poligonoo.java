import zuclib.Tartaruga;
import java.awt.*;

public class Poligonoo{

    int numLati;
    double lungLato;
    Color colore;
    double grossezza;

    Poligonoo(int numLati, double lungLato, Color colore, double grossezza){
        this.numLati = numLati;
        this.lungLato = lungLato;
        this.colore = colore;
        this.grossezza = grossezza;
    }

    void disegna(Tartaruga t){
        t.setColore(colore);
        t.setGrossezza(grossezza);
        for(int i = 0; i < numLati; i++){
            t.avanti(lungLato);
            t.destra(360 / numLati);
        }
    }
}