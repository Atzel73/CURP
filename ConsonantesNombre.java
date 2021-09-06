/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
class ConsonantesNombre {
    static String getConsonanteNombre(String Con_Nombre) {
      char arregloConsonanteN[] = Con_Nombre.toCharArray();
        char FC = ' ';
        
        String LastLetters;

        for (int i = 1; i < arregloConsonanteN.length; i++) {

            if (arregloConsonanteN[i] == 'b' ) {

                FC = 'B';
                break;
            } else if (arregloConsonanteN[i] == 'c' ) {

                FC = 'C';
                break;
            } else if (arregloConsonanteN[i] == 'd' ) {

                FC = 'D';
                break;
            } else if (arregloConsonanteN[i] == 'f') {

                FC = 'F';
               break;
            }else if (arregloConsonanteN[i] == 'g'){

              FC = 'G';
             break;
          }else if (arregloConsonanteN[i] == 'h'){
                  
              FC = 'H';
              break;
          } else if (arregloConsonanteN[i] == 'j'){
                  
              FC = 'J';
              break;
          } else if (arregloConsonanteN[i] == 'k'){
                  
              FC = 'K';
           break;
          } else if (arregloConsonanteN[i] == 'l' ){
                  
              FC = 'L';
              break;
          } else if (arregloConsonanteN[i] == 'm' ){
                  
              FC = 'M';
              break;
          } else if (arregloConsonanteN[i] == 'n' ){
                  
              FC = 'N';
              break;
          } else if (arregloConsonanteN[i] == 'ñ' ){
                  
              FC = 'X';
            break;
          } else if (arregloConsonanteN[i] == 'p' ){
                  
              FC = 'P';
              break;
          } else if (arregloConsonanteN[i] == 'q'){
                  
              FC = 'Q';
              break;
          } else if (arregloConsonanteN[i] == 'r'){
                  
              FC = 'R';
              break;
          } else if (arregloConsonanteN[i] == 's'){
                  
              FC = 'S';
             break;
          } else if (arregloConsonanteN[i] == 'h'){
                  
              FC = 'T';
              break;
          } else if (arregloConsonanteN[i] == 'v'){
                  
              FC = 'V';
              
          } else if (arregloConsonanteN[i] == 'w'){
                  
              FC = 'W';
              break;
          } else if (arregloConsonanteN[i] == 'x'){
                  
              FC = 'X';
         break;
          } else if (arregloConsonanteN[i] == 'y'){
                  
              FC = 'Y';
              break;
          } else if (arregloConsonanteN[i] == 'z'){
                  
              FC = 'Z';
              break;
          }
        }
        LastLetters = String.valueOf(FC);
        return LastLetters;
    }
    
}
