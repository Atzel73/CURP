
import static jdk.nashorn.internal.objects.NativeString.substring;

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
     public static String getTotal(String fin) {
        String LettersEnd;
        String Vtotal = fin;
        String SE = " ";

        if (Vtotal.equals("CACA")
                || Vtotal.equals("COLA") || Vtotal.equals("PATAS")
                || Vtotal.equals("BAKA") || Vtotal.equals("VACA") || Vtotal.equals("BUEY")
                || Vtotal.equals("BUEI") || Vtotal.equals("CACA") || Vtotal.equals("CACO")
                || Vtotal.equals("CAGA") || Vtotal.equals("CAGO") || Vtotal.equals("CAKA")
                || Vtotal.equals("COGE") || Vtotal.equals("COGI") || Vtotal.equals("COJA")
                || Vtotal.equals("COJE") || Vtotal.equals("COJI") || Vtotal.equals("COJO")
                || Vtotal.equals("CULO") || Vtotal.equals("PALO") || Vtotal.equals("FETO")
                || Vtotal.equals("GETA") || Vtotal.equals("JOTO") || Vtotal.equals("KACA")
                || Vtotal.equals("KACO") || Vtotal.equals("KAGA") || Vtotal.equals("KAGO")
                || Vtotal.equals("KAKA") || Vtotal.equals("KAKO") || Vtotal.equals("KOGE")
                || Vtotal.equals("KOGI") || Vtotal.equals("KOJA") || Vtotal.equals("KOJE")
                || Vtotal.equals("KOJI") || Vtotal.equals("KOJO") || Vtotal.equals("KOLA")
                || Vtotal.equals("KULO") || Vtotal.equals("LILO") || Vtotal.equals("LOCA")
                || Vtotal.equals("LOCO") || Vtotal.equals("LOKA") || Vtotal.equals("LOKO")
                || Vtotal.equals("MAME") || Vtotal.equals("MAMO") || Vtotal.equals("MEAR")
                || Vtotal.equals("MEAS") || Vtotal.equals("MEON") || Vtotal.equals("MIAR")
                || Vtotal.equals("MION") || Vtotal.equals("MOCO") || Vtotal.equals("MOKO")
                || Vtotal.equals("MULA") || Vtotal.equals("MULO") || Vtotal.equals("NACA")
                || Vtotal.equals("NACO") || Vtotal.equals("PEDA") || Vtotal.equals("PEDO")
                || Vtotal.equals("PENE") || Vtotal.equals("PIPI") || Vtotal.equals("PITO")
                || Vtotal.equals("POPO") || Vtotal.equals("PUTA") || Vtotal.equals("PUTO")
                || Vtotal.equals("QULO") || Vtotal.equals("RATA") || Vtotal.equals("ROBA")
                || Vtotal.equals("ROBE") || Vtotal.equals("ROBO") || Vtotal.equals("RUIN")
                || Vtotal.equals("SENO") || Vtotal.equals("TETA") || Vtotal.equals("VAGA")
                || Vtotal.equals("VAGO") || Vtotal.equals("VAKA") || Vtotal.equals("VUEI")
                || Vtotal.equals("VUEY") || Vtotal.equals("WUEI") || Vtotal.equals("WUEY")) {

            StringBuilder newString = new StringBuilder(Vtotal); 
            newString.setCharAt(1, 'X'); 
            

            SE = newString.toString();
            System.out.println( "ENTRÖ " + SE);
        } else {
            System.out.println("No entro");
            SE = fin;
        }

        return LettersEnd = SE;
    }

}
