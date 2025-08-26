import java.util.Scanner;
public class ClassificaJogador {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade :");
            int idade = scanner.nextInt();

            if (idade < 18){
            System.out.print("Base  ");
            }
            else if (idade <= 20){
                System.out.print(" Juvenil");

            }
            else if(idade <= 28){
                System.out.print("Adulto ");

            }
            else if (idade <= 34){
                System.out.print("Senior  ");

            }
            else {
                System.out.print(" Master ");
            }

            scanner.close();
    }
    
}
