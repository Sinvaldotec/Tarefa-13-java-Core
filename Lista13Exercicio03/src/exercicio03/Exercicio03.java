package exercicio03;

public class Exercicio03 {

	public static String verificarNumero(int numero) {
        if (numero > 0) {
            return "O número é positivo.";
        } else if (numero < 0) {
            return "O número é negativo.";
        } else {
            return "O número é zero.";
        }
    }

    public static void main(String[] args) {
        int numero = 123; // Altere este valor para testar com diferentes números
        String mensagem = verificarNumero(numero);
        System.out.println(mensagem);
    }
}