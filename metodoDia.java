/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class metodoDia {
    public static String getDay(String day){

        char arregloDia[] = day.toCharArray();
        char OD = arregloDia[0];
        String SD = " ";
        String Letters5 ;
        
        if (arregloDia[0] == '1'){
            SD = "01";
            
        } else if (arregloDia[0] == '2'){
            SD = "02";
            
        } else if (arregloDia[0] == '3'){
            SD = "03";
            
        } else if (arregloDia[0] == '4'){
            SD = "04";
            
        } else if (arregloDia[0] == '5'){
            SD = "05";
            
        } else if (arregloDia[0] == '6'){
            SD = "06";
            
        } else if (arregloDia[0] == '7'){
            SD = "07";
            
        } else if (arregloDia[0] == '8'){
            SD = "08";
            
        } else if (arregloDia[0] == '9'){
            SD = "09";
            
        } else if (arregloDia[0] == 10){
            SD = "10";
            
        } else if (arregloDia[0] == 11){
            SD = "11";
            
        } else if (arregloDia[0] == 12){
            SD = "12";
            
        }else if (arregloDia[0] == 13){
            SD = "13";
            
        } else if (arregloDia[0] == 14){
            SD = "14";
            
        } else if (arregloDia[0] == 15){
            SD = "15";
            
        } else if (arregloDia[0] == 16){
            SD = "16";
            
        } else if (arregloDia[0] == 17){
            SD = "17";
            
        } else if (arregloDia[0] == 18){
            SD = "18";
            
        } else if (arregloDia[0] == 19){
            SD = "19";
            
        } else if (arregloDia[0] == 20){
            SD = "20";
            
        } else if (arregloDia[0] == 21){
            SD = "21";
            
        } else if (arregloDia[0] == 22){
            SD = "22";
            
        } else if (arregloDia[0] == 23){
            SD = "23";
            
        } else if (arregloDia[0] == 24){
            SD = "24";
            
        } else if (arregloDia[0] == 25){
            SD = "25";
            
        } else if (arregloDia[0] == 26){
            SD = "26";
            
        } else if (arregloDia[0] == 27){
            SD = "27";
            
        } else if (arregloDia[0] == 28){
            SD = "28";
            
        } else if (arregloDia[0] == 29){
            SD = "29";
            
        } else if (arregloDia[0] == 30){
            SD = "30";
            
        } else if (arregloDia[0] == 31){
            SD = "31";
            
        } else if (day.equals("SELECCIÓN") ){
            System.out.println("Por favor, seleccione un campo");
        }
        
        return Letters5 = String.valueOf(SD);
    
}
    
}
