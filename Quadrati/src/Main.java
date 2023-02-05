import zuclib.Tartaruga;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tartaruga t = new Tartaruga();
        t.pennaSu();
        t.gotoXY(0.25,0.25);
        t.pennaGiu();
        t.setColore(Color.blue);
        t.setGrossezza(0.01);
        figuraQuadrati.quadrati(t,0.5,4);
    }
}