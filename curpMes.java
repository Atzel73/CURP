/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
class curpMes {
      public static String getMonth(String mes){
        
        String Mes = mes;
        String Letters9;
        String SM = " ";
        
        
        if(Mes.equals("ENERO")){
            SM = "01";
            
        }else if(Mes.equals("FEBRERO")){
            SM = "02";
        }else if(Mes.equals("MARZO")){
            SM = "03";
        }else if(Mes.equals("ABRIL")){
            SM = "04";
        }else if(Mes.equals("MAYO")){
            SM = "05";
        }else if(Mes.equals("JUNIO")){
            SM = "06";
        }else if(Mes.equals("JULIO")){
            SM = "07";
        }else if(Mes.equals("AGOSTO")){
            SM = "08";
        }else if(Mes.equals("SEPTIEMBRE")){
            SM = "09";
        }else if(Mes.equals("OCTUBRE")){
            SM = "10";
        }else if(Mes.equals("NOVIEMBRE")){
            SM = "11";
        }else if(Mes.equals("DICIEMBRE")){
            SM = "12";
        }
        return Letters9 = SM;
    }
    
}
