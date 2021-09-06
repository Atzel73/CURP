/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class curp_Sexo {
    public static String getSex(String sexo){
  String Sexo = sexo;
        String SexLetters;
       char SS = ' ';
        
        
        if(Sexo.equals("hombre")){
            SS = 'H';
        } else if(Sexo.equals("HOMBRE")){
            SS = 'H';
        } else if(Sexo.equals("mujer")){
            SS = 'M';
        }else if(Sexo.equals("MUJER")){
            SS = 'H';
        }
    return SexLetters = String.valueOf(SS);
}
}
