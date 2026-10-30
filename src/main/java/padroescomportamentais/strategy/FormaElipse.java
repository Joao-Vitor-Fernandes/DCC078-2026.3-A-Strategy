package padroescomportamentais.strategy;

public class FormaElipse implements Forma {

    public double calcular(double semieixoMaior, double semieixoMenor) {
        return Math.PI * semieixoMaior * semieixoMenor;
    }
}
