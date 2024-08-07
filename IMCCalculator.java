import java.util.Scanner;

public class IMCCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso ao usuário
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        // Solicita a altura ao usuário
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = calcularIMC(peso, altura);

        // Determina a categoria do IMC
        String categoria = determinarCategoria(imc);

        // Exibe o resultado
        System.out.printf("Seu IMC é: %.2f - Categoria: %s\n", imc, categoria);

        scanner.close();
    }

    // Método para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para determinar a categoria do IMC
    public static String determinarCategoria(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc >= 24.9 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
