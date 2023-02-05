import java.awt.*;
import static zuclib.GraficaSemplice.*;
public class Griglia {
    static double p;
    public static void setGriglia(double m, double n, double grossezza, Color color){
        setGrossezza(grossezza);
        setColore(color);
        p = 1/m;
        for(int i=0; i < m; i++){
            linea(0, p, 1, p);
            p = p + 1/m;
        }
        p = 1/n;
        for(int i=0; i < n; i++){
            linea(p, 0, p, 1);
            p = p + 1/n;
        }
    }
}