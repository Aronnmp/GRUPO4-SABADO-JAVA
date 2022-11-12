
package matrices;

import java.awt.TextArea;
import javax.swing.JOptionPane;


public class clsHelpers {
     public int recibeInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public float recibeFloat(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    public char recibeChar(String mensaje){
        return JOptionPane.showInputDialog(mensaje).toUpperCase().charAt(0);
    }
    public String recibeString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public void imprimeMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void imprimeMensaje(TextArea mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
