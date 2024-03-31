package exercicio08;

public class Exercicio08 {

	 // Método para calcular o fatorial de um número inteiro
    public static int calcularFatorial(int numero) {
        // Se o número for 0 ou 1, o fatorial é 1
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            // Inicializa o fatorial como 1
            int fatorial = 1;
            // Calcula o fatorial multiplicando todos os números de 1 até o número dado
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            // Retorna o resultado do fatorial
            return fatorial;
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do método calcularFatorial
        int numero = 12;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}