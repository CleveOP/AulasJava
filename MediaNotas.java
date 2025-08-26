/* Ler duas notas (0 a 100), calcular a média exibir aprovado para média >=70
 * ou reprovado para média <70.
*/
import javax.swing.JOptionPane;

public class MediaNotas {
    public static void main(String[] args) {
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));

        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota :"));
        // precisa converter para double = casting.// mas sempre é viavel usar o double para ficar mais exato as somas.
        double media = (nota1 + nota2) / 2;

        if(media >=70){
            JOptionPane.showMessageDialog(null,"Você foi aprovado com " + media);
        }
        else{
            JOptionPane.showMessageDialog(null,"Você foi reprovado com" + media );
        }

        
    }
}
