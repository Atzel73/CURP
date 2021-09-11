
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
public class curp_inicialMaterno {
            public static String getSecondName(String materno){

        char arregloMaterno[] = materno.toCharArray();
        char SN = arregloMaterno[0];
        String Letters3 ;
        if( SN == 'ñ'){
            SN = 'x';
        } else if ( SN == ' '){
             JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
        } 
        
        
        
        return Letters3 = String.valueOf(SN);
    }
    
}
