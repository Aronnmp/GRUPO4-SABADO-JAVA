package interfazG;




import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class matrixgrafica extends JPanel {
    private JTextField[][] listatxt; 
    private int txtaltura, txtancho, espacio;
    
    public matrixgrafica(){
        matrix();
    }
    public void matrix(){
    listatxt = new JTextField[9][9];
    txtaltura=60;
    txtancho=60;
    espacio=5; 
    }
    public void fisicasudoku(){
    this.setLayout(null);
    this.setSize(txtancho*9 + (espacio * 4), txtaltura*9+(espacio*4));
    this.setBackground(Color.white);
    }

    public JTextField[][] getListatxt() {
        return listatxt;
    }

    public void setListatxt(JTextField[][] listatxt) {
        this.listatxt = listatxt;
    }

    public int getTxtaltura() {
        return txtaltura;
    }

    public void setTxtaltura(int txtaltura) {
        this.txtaltura = txtaltura;
    }

    public int getTxtancho() {
        return txtancho;
    }

    public void setTxtancho(int txtancho) {
        this.txtancho = txtancho;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    
}
