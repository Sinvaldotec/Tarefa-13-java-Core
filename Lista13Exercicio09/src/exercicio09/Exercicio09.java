package exercicio09;

public class Exercicio09 {

	// Método para calcular a área do retângulo
    public static double calcularAreaRetangulo(double base, double altura) {
        // Fórmula para calcular a área do retângulo: base * altura
        double area = base * altura;
        return area;
    }
    
    // Método principal para teste
    public static void main(String[] args) {
        // Exemplo de uso do método calcularAreaRetangulo
        double base = 8.0;
        double altura = 10.0;
        double area = calcularAreaRetangulo(base, altura);
        System.out.println("A área do retângulo é: " + area);
    }
}