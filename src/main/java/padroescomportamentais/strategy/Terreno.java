package padroescomportamentais.strategy;

public class Terreno {

    private double area;

    public double getArea() {
        return area;
    }

    public void calcularAreaRetangular(double comprimento, double largura) {
        CalculadoraArea calculadora = new CalculadoraArea(comprimento, largura);
        this.area = calculadora.calcular(new FormaRetangulo());
    }

    public void calcularAreaTriangular(double base, double altura) {
        CalculadoraArea calculadora = new CalculadoraArea(base, altura);
        this.area = calculadora.calcular(new FormaTriangulo());
    }

    public void calcularAreaLosango(double diagonalMaior, double diagonalMenor) {
        CalculadoraArea calculadora = new CalculadoraArea(diagonalMaior, diagonalMenor);
        this.area = calculadora.calcular(new FormaLosango());
    }

    public void calcularAreaElipse(double semieixoMaior, double semieixoMenor) {
        CalculadoraArea calculadora = new CalculadoraArea(semieixoMaior, semieixoMenor);
        this.area = calculadora.calcular(new FormaElipse());
    }

}