/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerador;

/**
 *
 * @author Notebook
 */
public class Enumerador {

    /**
     * @param args the command line arguments
     */
    
    enum Combo {
        CHICO,
        MEDIANO,
        GRANDE
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Combo Cliente1 = Combo.CHICO;
        
        switch(Cliente1){
            case CHICO:
                System.out.println("El cliente seleciono el menu chico");
                break;
            case MEDIANO:
                System.out.println("El cliente seleciono el menu mediano");
                break;
            case GRANDE:
                System.out.println("El cliente seleciono el menu grande");
                break;
            default:
                System.out.println("combo es incorrecto");
        }
    }
    
}
