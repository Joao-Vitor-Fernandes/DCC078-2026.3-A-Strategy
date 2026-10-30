package padroescomportamentais.strategy;

public class FormaTriangulo implements Forma {

    public double calcular(double base, double altura) {
        return (base * altura) / 2;
    }
}
