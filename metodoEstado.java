/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class metodoEstado {
    public static String getState(String estado){
        
        String Estado = estado;
        String Letters9;
        String SM = " ";
   
            
         if(Estado.equals("AGUASCALIENTES " )){
            SM = "AGS";
        }else if(Estado.equals("BAJA CALIFORNIA")){
            SM = "Bc";
        }else if(Estado.equals("BAJA CALIFORNIA SUR")){
            SM = "BCS";
        }else if(Estado.equals("CAMPECHE")){
            SM = "BCS";
        }else if(Estado.equals("COAHUILA")){
            SM = "COAH";
        }else if(Estado.equals("COLIMA")){
            SM = "COL";
        }else if(Estado.equals("CHIAPAS")){
            SM = "CHIS";
        }else if(Estado.equals("CHIHUAHUA")){
            SM = "CHIH";
        }else if(Estado.equals("CIUDAD DE MÉXICO")){
            SM = "CDMX";
        }else if(Estado.equals("DURANGO")){
            SM = "HDG";
        }else if(Estado.equals("GUANAJUATO")){
            SM = "GTO";
        } else if(Estado.equals("GUERRERO")){
            SM = "GRO";
        }
        else if(Estado.equals("HIDALGO")){
            SM = "HGO";
        }
        else if(Estado.equals("JALISCO")){
            SM = "JAL";
        }
        else if(Estado.equals("ESTADO DE MÉXICO")){
            SM = "MEX";
        }
        else if(Estado.equals("MICHOACÁN")){
            SM = "MICH";   
        }
        else if(Estado.equals("MORELOS")){
            SM = "MOR";   
        }else if(Estado.equals("NAYARIT")){
            SM = "NAY";
        }else if(Estado.equals("NUEVO LEÓN")){
            SM = "NL";
        }else if(Estado.equals("OAXACA")){
            SM = "OAX";  
        }else if(Estado.equals("PUEBLA")){
            SM = "PUE";
        }else if(Estado.equals("QUERETARO")){
            SM = "QRO";     
        }else if(Estado.equals("QUINTANA ROO")){
            SM = "QROO";
        }else if(Estado.equals("SAN LUIS POTOSÍ")){
            SM = "SLP";
        }else if(Estado.equals("SINALOA")){
            SM = "SIN"; 
        }else if(Estado.equals("SONORA")){
            SM = "SON";
        }else if(Estado.equals("TABASCO")){
            SM = "TAB";
        }else if(Estado.equals("TAMAULIPAS")){
            SM = "TAMPS";
        }else if(Estado.equals("TLAXCALA")){
            SM = "TLAX";
        }else if(Estado.equals("VERACRUZ")){
            SM = "VER";
        }else if(Estado.equals("YUCATÁN")){
            SM = "YUC";
        }else if(Estado.equals("ZACATECAS")){
            SM = "ZAC";
        }else if (Estado.equals("   ")){
            SM = "No has elegido nada. Vulve a elegir";
        }
        return Letters9 = SM;
    }
    
}
