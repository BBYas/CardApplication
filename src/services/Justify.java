package services;

import DTO.FieldDTO;

public class Justify {

   public static String justifyString(String val,int size){
        int size_val = val.length();
        String adderString = " ";
        for(int i=1; i<= size - size_val; i++){
            val.concat(adderString);
       }
        return val;
    }

    public static String justifyInterger(String val,int size){
        int size_val = val.length();
        String adderString = "0";
        for(int i=1; i<= size - size_val; i++){
            adderString.concat("0");
        }
        adderString.concat(val);
        return(adderString);
    }

    public static String justifyDecimal(String val,int size,char sep){
        int size_val = val.length();
        int decimalPointPosition = val.indexOf(sep);
        String decimalPart = val.substring(decimalPointPosition + 1);
        int decimalPartSize =decimalPart.length();
        String integerPart = val.substring(0, decimalPointPosition);
        String adderString = new String();
        String decimalAdderString = new String();
        if(decimalPartSize >= 3)
            decimalPart = decimalPart.substring(0,3);
        else{
            for(int i=1; i<=(3 - decimalPartSize);i++){
                decimalAdderString.concat("0");
            }
            decimalPart.concat(decimalAdderString);
        }
        for(int i=1; i<= size - (integerPart.length() + 3); i++){
            adderString.concat("0");
        }
        integerPart.concat(adderString);
        return integerPart.concat(decimalPart);
    }

    public static String justifyEnum(String val, int size){
       int size_val = val.length();
       if (size == 1 ){
           return String.valueOf(Integer.valueOf(val) + 1);
       }
       if(size_val != size){
           String adderString = "0";
           for (int i=1; i<=(size - size_val); i++){
               adderString.concat(adderString);
           }
           return adderString.concat(val);
       }
       return val;
    }

    public static char justifyCharacter(String val){
        return val.charAt(0);
    }

    public static String justifyDate(String val,char sep){
       String year = val.substring(0,val.indexOf(sep));
        String first = val.substring(val.indexOf(sep) + 1);
        String month = first.substring(0,val.indexOf(sep));
        String day = first.substring(val.indexOf(sep) + 1);

        return year.concat(month.concat(day));
    }
}
