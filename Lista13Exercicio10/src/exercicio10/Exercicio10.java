package exercicio10;

public class Exercicio10 {

	// Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        // Se o número for menor ou igual a 1, não é primo
        if (numero <= 1) {
            return false;
        }
        
        // Verifica se o número é divisível por algum número além de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // Se for divisível, não é primo
                return false;
            }
        }
        
        // Se não foi divisível por nenhum número além de 1 e ele mesmo, é primo
        return true;
    }
    
    public static void main(String[] args) {
        // Exemplo de uso do método
        int numero = 45;
        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
