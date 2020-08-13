package services;

import DTO.DataTypes;
import DTO.FieldDTO;

public class Justify {
    public static String justifyField(FieldDTO fieldDTO) {
        DataTypes dataType = fieldDTO.getDataType();
        switch (dataType) {
            case DATE:
                return justifyDate(fieldDTO, '/');
            case ENUM:
                return justifyEnum(fieldDTO);
            case STRING:
                return justifyString(fieldDTO);
            case DECIMAL:
                justifyDecimal(fieldDTO, '.');
            case INTEGER:
                return justifyInteger(fieldDTO);
            case CHARACTER:
                return justifyCharacter(fieldDTO);
            default:
                return "default";
        }
    }

   public static String justifyString(FieldDTO fieldDTO){
       String val = fieldDTO.getValue();
       int size=fieldDTO.getMaxSize();
        int size_val = val.length();
        String adderString = " ";
        for(int i=1; i<= size - size_val; i++){
            val = val.concat(adderString);
       }
        return val;
    }

    public static String justifyInteger(FieldDTO fieldDTO){
        String val = fieldDTO.getValue();
        int size=fieldDTO.getMaxSize();
        int size_val = val.length();
        String adderString = "";
        for(int i=1; i<= size - size_val; i++){
            adderString = adderString.concat("0");
        }
        adderString = adderString.concat(val);
        return(adderString);
    }

    public static String justifyDecimal(FieldDTO fieldDTO,char sep){
        String val = fieldDTO.getValue();
        int size=fieldDTO.getMaxSize();
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
                decimalAdderString = decimalAdderString.concat("0");
            }
            decimalPart = decimalPart.concat(decimalAdderString);
        }
        for(int i=1; i<= size - (integerPart.length() + 3); i++){
            adderString = adderString.concat("0");
        }
        integerPart = adderString + integerPart;
        return integerPart.concat(decimalPart);
    }

    public static String justifyEnum(FieldDTO fieldDTO){
        String val = fieldDTO.getValue();
        int size=fieldDTO.getMaxSize();
       int size_val = val.length();
       if (size == 1 ){
           return String.valueOf(Integer.valueOf(val) + 1);
       }
       if(size_val != size){
           val = String.valueOf(Integer.valueOf(val) + 1);
           String adderString = "0";
           for (int i=1; i<=(size - size_val); i++){
               adderString.concat(adderString);
           }
           return adderString.concat(val);
       }
       return val;
    }

    public static String justifyCharacter(FieldDTO fieldDTO){
        return fieldDTO.getValue();
    }

    public static String justifyDate(FieldDTO fieldDTO,char sep){
        String val = fieldDTO.getValue();
        int size=fieldDTO.getMaxSize();
       String year = val.substring(0,val.indexOf(sep));
        String first = val.substring(val.indexOf(sep) + 1);
        String month = first.substring(0,first.indexOf(sep));
        String day = first.substring(first.indexOf(sep) + 1);

        return year.concat(month.concat(day));
    }
}
