package padroescomportamentais.strategy;

public class FormaLosango implements Forma {

    public double calcular(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
