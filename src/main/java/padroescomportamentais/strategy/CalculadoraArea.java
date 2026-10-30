package padroescomportamentais.strategy;

public class CalculadoraArea {

    private double medida1;
    private double medida2;

    public CalculadoraArea(double medida1, double medida2) {
        if (medida1 <= 0 || medida2 <= 0) {
            throw new IllegalArgumentException("Medidas devem ser maiores que zero");
        }
        this.medida1 = medida1;
        this.medida2 = medida2;
    }

    public double calcular(Forma forma) {
        return forma.calcular(medida1, medida2);
    }
}
