package dam1luqueabril_alberto_ej040370punto2dcons;

// Clase Punto con coordenadas X e Y
class Punto {
    float coordenadaX;
    float coordenadaY;

    // Constructor que inicializa las coordenadas
    Punto(float x, float y) {
        coordenadaX = x;
        coordenadaY = y;
    }
}

public class Main {

    public static void main(String[] args) {
        // Crear puntos con coordenadas
        Punto punto1 = new Punto(0.5f, 3.5f);
        Punto punto2 = new Punto(1.1f, 2.2f);
        Punto punto3 = new Punto(4.7f, 7.4f);

        // Calcular distancias al origen
        double distanciaOrigen1 = calcularDistanciaAlOrigen(punto1);
        double distanciaOrigen2 = calcularDistanciaAlOrigen(punto2);
        double distanciaOrigen3 = calcularDistanciaAlOrigen(punto3);

        // Imprimir resultados
        imprimirCoordenadasPuntos(punto1, punto2, punto3);
        imprimirDistanciaAlOrigen("P1", distanciaOrigen1);
        imprimirDistanciaAlOrigen("P2", distanciaOrigen

    }
}
