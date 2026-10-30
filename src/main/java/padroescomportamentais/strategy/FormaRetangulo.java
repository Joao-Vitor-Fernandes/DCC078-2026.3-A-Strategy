package padroescomportamentais.strategy;

public class FormaRetangulo implements Forma {

    public double calcular(double comprimento, double largura) {
        return comprimento * largura;
    }
}
