
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
public class metodoCurp_FN1 {
    public static String getFirstName(String Paterno){
    char arregloPaterno[] = Paterno.toCharArray();
        char FN1 = arregloPaterno[0];
        
        
        
        if( FN1 == 'ñ'){
            FN1 = 'x';
        } else if ( FN1 == ' '){
            JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
        }
        
        
        
        String SL = " ";
        String Letters ;
        
        for (int i = 1; i < arregloPaterno.length; i++) {
            
            if(arregloPaterno[i] == 'a' ){
                
                SL = "a";
                break;
                
            }else if( arregloPaterno[i] == 'e'){
                
                SL = "e";
                break;
                
            }else if(arregloPaterno[i] == 'i'){
                
                SL = "i";
               break;
                
            }else if ( arregloPaterno[i] == 'o'){
                
                SL = "o";
                break;
                
            } else if ( arregloPaterno[i] == 'u'){
                
                SL = "o";
               break;
                
            }else if ( arregloPaterno[i] == 'ñ'){
                
                SL = "x";
               break;
                
            } else if ( arregloPaterno[i] == ' '){
                
                SL = "No dejar campos vacíos. ";
               break;
                
            } 
            
        }
      
        
        
        Letters = String.valueOf(FN1) + SL;

        return  Letters;
        
    }
    
}
