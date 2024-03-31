package exercicio06;

public class Main {
    // Método para encontrar o maior entre dois números
    public static int encontrarMaior(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        // Chamando o método para encontrar o maior número
        int maiorNumero = encontrarMaior(numero1, numero2);

        System.out.println("O maior número entre " + numero1 + " e " + numero2 + " é: " + maiorNumero);
    }
}