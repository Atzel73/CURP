
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class curp_Nombre {
          public static String getName(String nombre){

        char arregloNombre[] = nombre.toCharArray();
        char ON = arregloNombre[0];
        String Letters4 ;
        
        if( ON == 'ñ'){
            ON = 'x';
        } else if ( ON == ' '){
            JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
        } 
        
        
        return Letters4 = String.valueOf(ON);
    }
}
