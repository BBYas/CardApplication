package converters;

import DTO.DataTypes;
import DTO.FieldDTO;

public class Converters {
    public static FieldDTO convertIden(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(20);
        return fieldDTO;
    }

    public static FieldDTO convertDate(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.DATE);
        fieldDTO.setMaxSize(8);
        return fieldDTO;
    }

    public static FieldDTO convertCustomerType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertCustomerId(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(24);
        return fieldDTO;
    }

    public static FieldDTO convertParentCustomer(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(24);
        return fieldDTO;
    }

    public static FieldDTO convertCustomerParentRelation(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertPromoter(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(20);
        return fieldDTO;
    }

    public static FieldDTO convertTitle(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertName(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(40);
        return fieldDTO;
    }

    public static FieldDTO convertBirthLocation(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(40);
        return fieldDTO;
    }

    public static FieldDTO convertIdentityType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertIdentity(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(20);
        return fieldDTO;
    }

    public static FieldDTO convertFirstGender(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertMaritalStatus(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertNationality(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.INTEGER);
        fieldDTO.setMaxSize(3);
        return fieldDTO;
    }

    public static FieldDTO convertNumberOfDependents(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.INTEGER);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertPositionOrTitle(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.INTEGER);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertAddressType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(2);
        return fieldDTO;
    }

    public static FieldDTO convertAddressLine(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(40);
        return fieldDTO;
    }

    public static FieldDTO convertZipCode(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.INTEGER);
        fieldDTO.setMaxSize(5);
        return fieldDTO;
    }

    public static FieldDTO convertAddressPhone(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(20);
        return fieldDTO;
    }

    public static FieldDTO convertAddressFax(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(20);
        return fieldDTO;
    }

    public static FieldDTO convertCity(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(20);
        return fieldDTO;
    }

    public static FieldDTO convertLanguage(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.ENUM);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertAccountType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertMXPAccount(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(24);
        return fieldDTO;
    }

    public static FieldDTO convertBankAccount(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(24);
        return fieldDTO;
    }

    public static FieldDTO convertAccountCurrency(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(3);
        return fieldDTO;
    }

    public static FieldDTO convertDebitProgramId(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertCreditLimit(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.DECIMAL);
        fieldDTO.setMaxSize(15);
        return fieldDTO;
    }
    public static FieldDTO convertGuaranteeType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertGuaranteeValue(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.DECIMAL);
        fieldDTO.setMaxSize(15);
        return fieldDTO;
    }

    public static FieldDTO convertGuaranteeInfo(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(80);
        return fieldDTO;
    }

    public static FieldDTO convertNameOnCard(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(25);
        return fieldDTO;
    }

    public static FieldDTO convertCorporateName(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(25);
        return fieldDTO;
    }

    public static FieldDTO convertCardProgramId(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(25);
        return fieldDTO;
    }

    public static FieldDTO convertAutomaticManualCardNumber(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertPrimarySecondary(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertPrimaryCard(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(19);
        return fieldDTO;
    }

    public static FieldDTO convertNewCardDesign(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertCardDesignFee(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertExpressDelivery(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }

    public static FieldDTO convertDeliveryOperator(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertExpressDeliveryFee(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertCardPersonalizationFee(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertCorrespondenceType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.STRING);
        fieldDTO.setMaxSize(10);
        return fieldDTO;
    }

    public static FieldDTO convertClientType(String value) {
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(value);
        fieldDTO.setDataType(DataTypes.CHARACTER);
        fieldDTO.setMaxSize(1);
        return fieldDTO;
    }



















}
