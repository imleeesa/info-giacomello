import zuclib.Tartaruga;
public class figuraQuadrati {
    public static void quadrati(Tartaruga t, double lato, int numQuad){
        for(int j=0; j < numQuad; j++){
            for(int i=0; i < 4; i++){
                t.avanti(lato);
                t.destra(90);
            }
        t.avanti(lato/2);
        t.destra(45);
        lato = Math.sqrt(2 * (lato/2 * lato/2));
        }
    }
}