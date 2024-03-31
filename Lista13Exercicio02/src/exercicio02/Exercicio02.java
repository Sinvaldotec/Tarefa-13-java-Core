package exercicio02;

public class Exercicio02 {

	// Método para calcular o quadrado de um número
    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        int numero = 5;
        int quadrado = calcularQuadrado(numero);
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
    }
}
