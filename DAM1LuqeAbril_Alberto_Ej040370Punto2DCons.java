
package dam1luqueabril_albertoej040370punto2dcons;

class P {
    float a;
    float b;

    P(float x, float y) {
        a = x;
        b = y;
    }
}

public class dam1luqueabril_alberto_ej040370punto2dcons {

    public static void main(String[] args) {
        P p1 = new P(0.5f, 3.5f);
        P p2 = new P(1.1f, 2.2f);
        P p3 = new P(4.7f, 7.4f);

        double d1, d2, d3;

        d1 = Math.sqrt((Math.pow(p1.a, 2) + Math.pow(p1.b, 2)));
        d1 = (float) d1;
        d2 = Math.sqrt((Math.pow(p2.a, 2) + Math.pow(p2.b, 2)));
        d2 = (float) d2;
        d3 = Math.sqrt((Math.pow(p3.a, 2) + Math.pow(p3.b, 2)));
        d3 = (float) d3;

        System.out.printf("P1: (%.01f, %.01f) P2: (%.01f, %.01f) P3: (%.01f, %.01f)\n", p1.a, p1.b, p2.a, p2.b, p3.a, p3.b);

        System.out.printf("Distancia P1 al Origen: %.5f\n", d1);
        System.out.printf("Distancia P2 al Origen: %.5f\n", d2);
        System.out.printf("Distancia P3 al Origen: %.5f\n", d3);
    }
}