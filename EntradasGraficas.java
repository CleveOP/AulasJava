
import javax.swing.JOptionPane;


    /* showInputDialog(msg); entrada em caixa de dialogo que devolve sempre uma String
 * Para obter outros tipos , teremos que converter a String devolvida
 * para int = Integer.parseInt(String)
 * para double = Double.parseDouble(String)
 * para float = Float.parseFloat(String)
 * para char = String.charAt(0)
 * para boolean = Boolean.parseBoolean(String)
 * 
 */
public class EntradasGraficas {
    public static void main(String[] args) {
        //String primeiroNome = JOptionPane.showInputDialog("Digite seu primeiro nome:");
        //String ultimoNome = JOptionPane.showInputDialog("Digite seu ultimo nome");
        //JOptionPane.showMessageDialog(null,"Seu nome completo é :" + primeiroNome +  "  "  + ultimoNome);

        String temp = JOptionPane.showInputDialog("Digite um numero");
        int inteiro = Integer.parseInt(temp);

        //mesma função de maneria diferente .

        double real = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real:"));

        temp  = JOptionPane.showInputDialog("Digite true ou false");
        boolean eVerdade = Boolean.parseBoolean(temp);

        JOptionPane.showMessageDialog(null, "o inteiro e" + inteiro + "\no real e" + real + "\na logica e " + eVerdade);


    } 
}