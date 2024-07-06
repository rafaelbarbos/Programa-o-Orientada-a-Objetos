package Atividade2;

public class Círculo extends Figura implements Desenho {
    private double raio;

    public Círculo() {
        this.raio = 0;
    }

    public Círculo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String desenhar() {
        return "Desenhando a Figura Círculo";
    }
}

