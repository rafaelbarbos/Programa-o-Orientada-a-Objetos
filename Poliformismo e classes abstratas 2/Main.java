package Atividade2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        Quadrado quadrado = new Quadrado(4);
        Triângulo triângulo = new Triângulo(3, 4, 5, 2.5);
        Círculo círculo = new Círculo(3);
        Retângulo retângulo = new Retângulo(4, 6);

        // Calculando área e perímetro
        System.out.println("Quadrado - Área: " + quadrado.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro());
        System.out.println("Triângulo - Área: " + triângulo.calcularArea() + ", Perímetro: " + triângulo.calcularPerimetro());
        System.out.println("Círculo - Área: " + círculo.calcularArea() + ", Perímetro: " + círculo.calcularPerimetro());
        System.out.println("Retângulo - Área: " + retângulo.calcularArea() + ", Perímetro: " + retângulo.calcularPerimetro());

        // Criando uma lista de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(quadrado);
        figuras.add(triângulo);
        figuras.add(círculo);
        figuras.add(retângulo);

        // Executando os métodos para cada figura na lista
        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
        }

        // Desenhando as figuras
        ArrayList<Desenho> desenhos = new ArrayList<>();
        desenhos.add(quadrado);
        desenhos.add(triângulo);
        desenhos.add(círculo);
        desenhos.add(retângulo);

        for (Desenho desenho : desenhos) {
            System.out.println(desenho.desenhar());
        }
    }
}

