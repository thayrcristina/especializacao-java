import java.util.Scanner;

public class CalculoImc  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULO DO INDICE DE MASSA CORPORAL");

        System.out.print("Digite o seu peso (em kg): ");
        Double pesoKG = scanner.nextDouble();

        System.out.print("Digite a sua altura (em metros): ");
        Double altura = scanner.nextDouble();

        Double alturaQuadrado = altura * altura;

        Double resultado = pesoKG / alturaQuadrado;

        System.out.print("O seu IMC é: " + resultado);

        scanner.close();
    }
}