package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
        int numero = 7; // Exemplo de número para teste
        boolean resultado = verificarParidade(numero);
        
        if (resultado) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
    
    public static boolean verificarParidade(int numero) {
        return numero % 2 == 0;
    }
}