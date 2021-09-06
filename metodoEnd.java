/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class metodoEnd {
     public static String getTotal(String fin){
         String LettersEnd;
         String Vtotal = fin;
         char[] tempCharArray = fin.toCharArray();
         if(fin.equals("CACA") || fin.equals("COLA") || fin.equals("PATAS")  || fin.equals("BAKA")  || fin.equals("VACA") || fin.equals("BUEY") || fin.equals("BUEI") || fin.equals("CACA") || fin.equals("CACO") || fin.equals("CAGA") || fin.equals("CAGO") || fin.equals("CAKA") || fin.equals("COGE") || fin.equals("COGI")  || fin.equals("COJA") || fin.equals("COJE") || fin.equals("COJI") || fin.equals("COJO") || fin.equals("CULO") || fin.equals("PALO") || fin.equals("FETO") || fin.equals("GETA") || fin.equals("JOTO") || fin.equals("KACA") || fin.equals("KACO") || fin.equals("KAGA") || fin.equals("KAGO") || fin.equals("KAKA") || fin.equals("KAKO") || fin.equals("KOGE") || fin.equals("KOGI") || fin.equals("KOJA") || fin.equals("KOJE") || fin.equals("KOJI") || fin.equals("KOJO") || fin.equals("KOLA") || fin.equals("KULO") || fin.equals("LILO") || fin.equals("LOCA") || fin.equals("LOCO") || fin.equals("LOKA") || fin.equals("LOKO") || fin.equals("MAME") || fin.equals("MAMO") || fin.equals("MEAR") || fin.equals("MEAS") || fin.equals("MEON") || fin.equals("MIAR") || fin.equals("MION") || fin.equals("MOCO") || fin.equals("MOKO") || fin.equals("MULA") || fin.equals("MULO") || fin.equals("NACA") || fin.equals("NACO") || fin.equals("PEDA") || fin.equals("PEDO") || fin.equals("PENE") || fin.equals("PIPI") || fin.equals("PITO") || fin.equals("POPO") || fin.equals("PUTA") || fin.equals("PUTO") || fin.equals("QULO") || fin.equals("RATA") || fin.equals("ROBA") || fin.equals("ROBE") || fin.equals("ROBO") || fin.equals("RUIN") || fin.equals("SENO") || Vtotal.equals("TETA") || fin.equals("VAGA") || fin.equals("VAGO") || fin.equals("VAKA") || fin.equals("VUEI") || fin.equals("VUEY") || fin.equals("WUEI") || fin.equals("WUEY")){
             
             tempCharArray[1] = 'X';
             fin = String.valueOf(tempCharArray);
             
             
             
         }
         
         
         
         
         return LettersEnd = fin;
     }
     
}
