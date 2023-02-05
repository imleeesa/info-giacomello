import zuclib.Tartaruga;
import static zuclib.GraficaSemplice.*;

public class Main {
    public static void main(String[] args) {

        Tartaruga t = new Tartaruga();

        Poligonoo quadrato = new Poligonoo(4, 0.3, ROSSO, 0.01);
        Poligonoo pentagono = new Poligonoo(5, 0.25, VERDE,0.01);
        Poligonoo esagono = new Poligonoo(6, 0.2, BLU,0.01);
        Poligonoo triangolo = new Poligonoo(3, 0.3, NERO, 0.01);

        t.pennaSu();
        t.gotoXY(0.1, 0.6);
        t.pennaGiu();

        quadrato.disegna(t);
        t.sinistra(90);

        t.pennaSu();
        t.gotoXY(0.9, 0.6);
        t.pennaGiu();

        pentagono.disegna(t);

        t.pennaSu();
        t.gotoXY(0.4, 0.1);
        t.pennaGiu();

        esagono.disegna(t);

        t.pennaSu();
        t.gotoXY(0.95, 0.1);
        t.pennaGiu();

        triangolo.disegna(t);
    }
}