/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class ConsonanteNombre {
      static String getConsonanteNombre(String Con_Nombre) {
      char arregloConsonanteN[] = Con_Nombre.toCharArray();
        char FC = ' ';
        
        String LastLetters;

        for (int i = 1; i < arregloConsonanteN.length; i++) {

            if (arregloConsonanteN[i] == 'b' ) {

                FC = 'B';
                
            } else if (arregloConsonanteN[i] == 'c' ) {

                FC = 'C';
                
            } else if (arregloConsonanteN[i] == 'd' ) {

                FC = 'D';
                
            } else if (arregloConsonanteN[i] == 'f') {

                FC = 'F';
               
            }else if (arregloConsonanteN[i] == 'g'){

              FC = 'G';
             
          }else if (arregloConsonanteN[i] == 'h'){
                  
              FC = 'H';
              
          } else if (arregloConsonanteN[i] == 'j'){
                  
              FC = 'J';
              
          } else if (arregloConsonanteN[i] == 'k'){
                  
              FC = 'K';
           
          } else if (arregloConsonanteN[i] == 'l' ){
                  
              FC = 'L';
              
          } else if (arregloConsonanteN[i] == 'm' ){
                  
              FC = 'M';
              
          } else if (arregloConsonanteN[i] == 'n' ){
                  
              FC = 'N';
              
          } else if (arregloConsonanteN[i] == 'ñ' ){
                  
              FC = 'X';
            
          } else if (arregloConsonanteN[i] == 'p' ){
                  
              FC = 'P';
              
          } else if (arregloConsonanteN[i] == 'q'){
                  
              FC = 'Q';
              
          } else if (arregloConsonanteN[i] == 'r'){
                  
              FC = 'R';
              
          } else if (arregloConsonanteN[i] == 's'){
                  
              FC = 'S';
             
          } else if (arregloConsonanteN[i] == 'h'){
                  
              FC = 'T';
              
          } else if (arregloConsonanteN[i] == 'v'){
                  
              FC = 'V';
              
          } else if (arregloConsonanteN[i] == 'w'){
                  
              FC = 'W';
              
          } else if (arregloConsonanteN[i] == 'x'){
                  
              FC = 'X';
         
          } else if (arregloConsonanteN[i] == 'y'){
                  
              FC = 'Y';
              
          } else if (arregloConsonanteN[i] == 'z'){
                  
              FC = 'Z';
              
          }
        }
        LastLetters = String.valueOf(FC);
        return LastLetters;
    }
    
    
}
