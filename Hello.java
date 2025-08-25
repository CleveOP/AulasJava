import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        double numero1, numero2;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    numero1 = scanner.nextDouble();
    
    System.out.println("Digite o segundo numero: ");
    numero2 = scanner.nextDouble();

    double resultado = numero1 + numero2 ;

    scanner.close(); 

    System.out.println("O terceiro numero sera: " + resultado ) ;
    


    




        }
    }