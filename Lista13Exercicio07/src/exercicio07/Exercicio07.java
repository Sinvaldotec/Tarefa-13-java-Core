package exercicio07;

public class Exercicio07 {

	public static boolean isPalindrome(String str) {
        // Removendo espaços em branco e convertendo para minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Invertendo a string
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Verificando se a string original é igual à string invertida
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        String testString = "Ame a ema";
        if (isPalindrome(testString)) {
            System.out.println(testString + " é um palíndromo.");
        } else {
            System.out.println(testString + " não é um palíndromo.");
        }
    }
}
