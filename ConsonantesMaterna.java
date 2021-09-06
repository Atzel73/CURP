/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class ConsonantesMaterna {
    static String getConsonantesMa(String Con_materno) {
      char arregloConsonanteM[] = Con_materno.toCharArray();
        char FC = ' ';
        char SL = ' ';
        String Letters7;

        for (int i = 1; i < arregloConsonanteM.length; i++) {

            if (arregloConsonanteM[i] == 'b' ) {

                FC = 'B';
                break;
            } else if (arregloConsonanteM[i] == 'c' ) {

                FC = 'C';
                break;
            } else if (arregloConsonanteM[i] == 'd' ) {

                FC = 'D';
                
            } else if (arregloConsonanteM[i] == 'f') {

                FC = 'F';
               break;
            }else if (arregloConsonanteM[i] == 'g'){

              FC = 'G';
             break;
          }else if (arregloConsonanteM[i] == 'h'){
                  
              FC = 'H';
              break;
          } else if (arregloConsonanteM[i] == 'j'){
                  
              FC = 'J';
              break;
          } else if (arregloConsonanteM[i] == 'k'){
                  
              FC = 'K';
           break;
          } else if (arregloConsonanteM[i] == 'l' ){
                  
              FC = 'L';
              break;
          } else if (arregloConsonanteM[i] == 'm' ){
                  
              FC = 'M';
              break;
          } else if (arregloConsonanteM[i] == 'n' ){
                  
              FC = 'N';
              break;
          } else if (arregloConsonanteM[i] == 'ñ' ){
                  
              FC = 'X';
            break;
          } else if (arregloConsonanteM[i] == 'p' ){
                  
              FC = 'P';
              break;
          } else if (arregloConsonanteM[i] == 'q'){
                  
              FC = 'Q';
              break;
          } else if (arregloConsonanteM[i] == 'r'){
                  
              FC = 'R';
              break;
          } else if (arregloConsonanteM[i] == 's'){
                  
              FC = 'S';
             break;
          } else if (arregloConsonanteM[i] == 'h'){
                  
              FC = 'T';
              break;
          } else if (arregloConsonanteM[i] == 'v'){
                  
              FC = 'V';
              break;
          } else if (arregloConsonanteM[i] == 'w'){
                  
              FC = 'W';
              break;
          } else if (arregloConsonanteM[i] == 'x'){
                  
              FC = 'X';
         break;
          } else if (arregloConsonanteM[i] == 'y'){
                  
              FC = 'Y';
              break;
          } else if (arregloConsonanteM[i] == 'z'){
                  
              FC = 'Z';
              break;
          }
        }
        Letters7 = String.valueOf(FC);
        return Letters7;
    }
    
}
