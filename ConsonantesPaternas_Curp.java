/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
class ConsonantesPaternas_Curp {

    static String getConsonantesPA(String ConPaterno) {
      char arregloConsonantesP[] = ConPaterno.toCharArray();
        char FC = ' ';
        char SL = ' ';
        String Letters7;

        for (int i = 1; i < arregloConsonantesP.length; i++) {

            if (arregloConsonantesP[i] == 'b') {

                FC = 'B';
                break;
                
            } else if (arregloConsonantesP[i] == 'c' ) {

                FC = 'C';
                break;
            } else if (arregloConsonantesP[i] == 'd' ) {

                FC = 'D';
                break;
            } else if (arregloConsonantesP[i] == 'f' ) {

                FC = 'F';
                break;
            }else if (arregloConsonantesP[i] == 'g' ){

              FC = 'G';
              break;
          }else if (arregloConsonantesP[i] == 'h' ){
                  
              FC = 'H';
              break;
          } else if (arregloConsonantesP[i] == 'j' ){
                  
              FC = 'J';
              break;
          } else if (arregloConsonantesP[i] == 'k' ){
                  
              FC = 'K';
              break;
          } else if (arregloConsonantesP[i] == 'l' ){
                  
              FC = 'L';
            break;
          } else if (arregloConsonantesP[i] == 'm' ){
                  
              FC = 'M';
              SL = 'M';
          } else if (arregloConsonantesP[i] == 'n' ){
                  
              FC = 'N';
             break;
          } else if (arregloConsonantesP[i] == 'ñ' ){
                  
              FC = 'X';
              break;
          } else if (arregloConsonantesP[i] == 'p' ){
                  
              FC = 'P';
             break;
          } else if (arregloConsonantesP[i] == 'q' ){
                  
              FC = 'Q';
              break;
          } else if (arregloConsonantesP[i] == 'r' ){
                  
              FC = 'R';
              break;
          } else if (arregloConsonantesP[i] == 's' ){
                  
              FC = 'S';
              break;
          } else if (arregloConsonantesP[i] == 'h' ){
                  
              FC = 'T';
              break;
          } else if (arregloConsonantesP[i] == 'v'){
                  
              FC = 'V';
              break;
          } else if (arregloConsonantesP[i] == 'w' ){
                  
              FC = 'W';
              break;
          } else if (arregloConsonantesP[i] == 'x' ){
                  
              FC = 'X';
              break;
          } else if (arregloConsonantesP[i] == 'y' ){
                  
              FC = 'Y';
              break;
          } else if (arregloConsonantesP[i] == 'z' ){
                  
              FC = 'Z';
              break;
          }
        }
        Letters7 = String.valueOf(FC);
        return Letters7;
    }
    
}
