import java.util.Scanner;
public class Contas {
    public static void main (String [] args){
        // Ler um número inteiro , calcular e exibir o sucessor e raiz quadrada.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um inteiro");
        int numero = scanner.nextInt();
        int dobro = 2 * numero;
        int sucessor = numero + 1;
        double raiz = Math.sqrt(numero);
        System.out.println("dobro de " + numero + " = " + dobro);
        System.out.println("sucessor de " + numero + " = " + sucessor );
        System.out.println("raiz de " + numero + " = " + raiz );

        scanner.close();



        
    }
}
