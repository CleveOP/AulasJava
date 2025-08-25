    //O IMC é dado por peso / (altura ao quadrado)
    // ler o peso ea altura de uma pessoa calcular e exibir seu IMC
import java.util.Scanner;
public class Saude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);// prefira sempre a conta simples.
        double imc1 = peso / Math.pow(altura, 2);
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Seu IMC é: " + imc1);
        scanner.close();
    }
}
