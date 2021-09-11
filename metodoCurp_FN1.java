
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
        } else if ( FN1 == 1 || FN1 == 2 || FN1 == 3 || FN1 == 4 || FN1 == 5 || FN1 == 6 || FN1 == 7 || FN1 == 8 || FN1 == 9 || FN1 == 0){
            System.out.println("No dejar espacios en blanco");
            
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
                
            } else if ( arregloPaterno[i] == 1 || arregloPaterno[i] == 2 || arregloPaterno[i] == 3 || arregloPaterno[i] == 4 || arregloPaterno[i] == 5 || arregloPaterno[i] == 6 || arregloPaterno[i] == 7 || arregloPaterno[i] == 8 || arregloPaterno[i] == 9 || arregloPaterno[i] == 0){
                
                System.out.println("No dejar espacios en blanco");
               break;
                
            }
            
        }
      
        
        
        Letters = String.valueOf(FN1) + SL;

        return  Letters;
        
    }
    
}
