package principal;

import modelo.Sudoku;
import vista.FormSudoku;

public class Principal {

    public static void main(String[] args) {
        FormSudoku sudoku = new FormSudoku();       
        char opcion = ' ';
        Atajos A = new Atajos();
        Menu M = new Menu();
              
        String[][] matriz = new String[0][0];
        
        do {
            opcion = A.RecibeChar("Seleccione una opcion"
                    + "\nA. Abrir Sudoku"
                    + "\nB. Agregar Usuario"
                    + "\nC. Eliminar Usuario"
                    + "\nS. Salir"
                    + "");
            switch (opcion) {
                case 'A':
                    sudoku.setVisible(true);
                    break;
                case 'B':
                    
                    break;
                case 'C':
                    
                    break;
                case 'S':
                    break;
                default:
                    break;
            }
        } while (opcion != 'S' & opcion != 'A');
        
        
    }
}
