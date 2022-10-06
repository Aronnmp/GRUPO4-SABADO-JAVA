package prjproyectofinal;
/**
 *
 * @author Juanpa
 */
public class Menu {
    public void MenuPrincipal(){
        Atajos clsA = new Atajos();
        char eleccion = ' ';        
        do{
            eleccion = clsA.RecibeChar("Escoga una opcion:"
                    + "\nJ. Juego"
                    + "\nE. Estadisticas"
                    + "\nT. opc"
                    + "\nA. opc"
                    + "\nB. opc"
                    + "\nR. opc"
                    + "\nO. opc"
                    + "\nS. opc");
            switch(eleccion){
            case 'J':
                
                break;
            case 'E':
                
                break;
            case 'T':
                
                break;
            case 'A':
                
                break;
            case 'B':
                
                break;
            case 'R':
                
                break;
            case 'O':
                
                break;
            case 'S':
                clsA.imprimeMensaje("Gracias por usar el programa :)");
                break;
            default:
                clsA.imprimeMensaje("Escoga una opción valida");
                break;
            }
        }while(eleccion != 'S');   
    }
}
