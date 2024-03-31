package exercicio05;

public class Exercicio05 {

	public static boolean verificaAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int ano = 1978; // Altere o ano conforme necessário
        if (verificaAnoBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}