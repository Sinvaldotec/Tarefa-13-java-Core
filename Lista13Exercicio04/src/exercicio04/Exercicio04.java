package exercicio04;

public class Exercicio04 {

	public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double numero1 = 10.5;
        double numero2 = 20.3;
        double numero3 = 15.8;

        double media = calcularMedia(numero1, numero2, numero3);
        System.out.println("A média dos números é: " + media);
    }
}
