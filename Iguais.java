import java.util.Scanner;
public class Iguais{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro numero : ");
        double valor1 = scanner.nextDouble();

        System.out.print("digite o segundo numero : ");
        double valor2 = scanner.nextDouble();

        if(valor1 == valor2){
            System.out.print("Os valores são iguais !!");
        }
        if(valor1 > valor2){
            System.out.print("O valor 1 é maior !! ");
        }
        else{
            System.out.print("O valor 2 é maior !! ");
        }

        scanner.close();
        

    }

}
