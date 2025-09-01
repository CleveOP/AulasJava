import javax.swing.JOptionPane;

public class Meses{
    public static void main ( String[] args){
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes(1 a 12)"));

        switch (mes){
            case 1:
            JOptionPane.showMessageDialog(null,"janeiro");
            break;
                case 2:
                    JOptionPane.showMessageDialog(null,"fevereiro");
            break;
                case 3:
                    JOptionPane.showMessageDialog(null,"março");
            break;
                case 4:
                    JOptionPane.showMessageDialog(null,"abril");
            break;
                case 5:
                    JOptionPane.showMessageDialog(null,"maio");
            break;
                case 6:
                    JOptionPane.showMessageDialog(null,"junho");
            break;
                case 7:
                    JOptionPane.showMessageDialog(null,"julho");
            break; 
                case 8:
                    JOptionPane.showMessageDialog(null,"agosto");
            break;
                case 9:
                    JOptionPane.showMessageDialog(null,"setembro");
            break;
                case 10:
                    JOptionPane.showMessageDialog(null,"outubro");
            break;
                case 11:
                    JOptionPane.showMessageDialog(null,"novembro");
            break;
                case 12:
                    JOptionPane.showMessageDialog(null,"dezembro");
            break;

        default:
            JOptionPane.showMessageDialog(null,"valor invalido");
        }

    }
}