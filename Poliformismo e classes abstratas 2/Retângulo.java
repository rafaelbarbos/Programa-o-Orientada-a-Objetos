package Atividade2;

public class Retângulo extends Quadrado {
    private double altura;

    public Retângulo() {
        super();
        this.altura = 0;
    }

    public Retângulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getLado() * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (getLado() + altura);
    }

    public String desenhar() {
        return "Desenhando a Figura Retângulo";
    }
}

