package generation;

import DTO.FieldDTO;
import converters.Converters;
import services.Justify;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static converters.Converters.*;

public class Generation {
    private static ArrayList<FieldDTO> fieldDTOS = new ArrayList<>();

    private static String applicationIden;
    private static String applicantTitle;
    private static String applicantFirstName;
    private static String applicantMiddleName;
    private static String applicantLastName;
    private static String applicantMaritalStatus;
    private static String applicantBirthDate;
    private static String applicantBirthLocation;
    private static String applicantAddressType;
    private static String applicantAddress;
    private static String applicantCity;
    private static String applicantPhoneNumber;
    private static String holderTitle;
    private static String holderFirstName;
    private static String holderMiddleName;
    private static String holderLastName;
    private static String nameOnCard;
    private static String primarySecondary;
    private static String primaryCard;

    public static void setApplicationIden(String applicationIden) {
        Generation.applicationIden = applicationIden;
    }

    public static void setApplicantTitle(String applicantTitle) {
        Generation.applicantTitle = applicantTitle;
    }

    public static void setApplicantFirstName(String applicantFirstName) {
        Generation.applicantFirstName = applicantFirstName;
    }

    public static void setApplicantMiddleName(String applicantMiddleName) {
        Generation.applicantMiddleName = applicantMiddleName;
    }

    public static void setApplicantLastName(String applicantLastName) {
        Generation.applicantLastName = applicantLastName;
    }

    public static void setApplicantMaritalStatus(String applicantMaritalStatus) {
        Generation.applicantMaritalStatus = applicantMaritalStatus;
    }

    public static void setApplicantBirthDate(String applicantBirthDate) {
        Generation.applicantBirthDate = applicantBirthDate;
    }

    public static void setApplicantBirthLocation(String applicantBirthLocation) {
        Generation.applicantBirthLocation = applicantBirthLocation;
    }

    public static void setApplicantAddressType(String applicantAddressType) {
        Generation.applicantAddressType = applicantAddressType;
    }

    public static void setApplicantAddress(String applicantAddress) {
        Generation.applicantAddress = applicantAddress;
    }

    public static void setApplicantCity(String applicantCity) {
        Generation.applicantCity = applicantCity;
    }

    public static void setApplicantPhoneNumber(String applicantPhoneNumber) {
        Generation.applicantPhoneNumber = applicantPhoneNumber;
    }

    public static void setHolderTitle(String holderTitle) {
        Generation.holderTitle = holderTitle;
    }

    public static void setHolderFirstName(String holderFirstName) {
        Generation.holderFirstName = holderFirstName;
    }

    public static void setHolderMiddleName(String holderMiddleName) {
        Generation.holderMiddleName = holderMiddleName;
    }

    public static void setHolderLastName(String holderLastName) {
        Generation.holderLastName = holderLastName;
    }

    public static void setNameOnCard(String nameOnCard) {
        Generation.nameOnCard = nameOnCard;
    }

    public static void setPrimarySecondary(String primarySecondary) {
        Generation.primarySecondary = primarySecondary;
    }

    public static void setPrimaryCard(String primaryCard) {
        Generation.primaryCard = primaryCard;
    }

    public static int generateFile() {
        fieldDTOS.add(Converters.convertIden(applicationIden));
        fieldDTOS.add(Converters.convertDate("1996/07/15"));
        fieldDTOS.add(Converters.convertIden("cdxuyhj"));
        fieldDTOS.add(Converters.convertIden("xwrhtbvcjrty"));
        fieldDTOS.add(Converters.convertCustomerType("a"));
        fieldDTOS.add(Converters.convertCustomerId("xghgrdy"));
        fieldDTOS.add(Converters.convertParentCustomer("sffh"));
        fieldDTOS.add(Converters.convertCustomerParentRelation("3"));
        fieldDTOS.add(Converters.convertPromoter("hdyu"));
        fieldDTOS.add(Converters.convertTitle(applicantTitle));
        fieldDTOS.add(Converters.convertName(applicantFirstName));
        fieldDTOS.add(Converters.convertName(applicantMiddleName));
        fieldDTOS.add(Converters.convertName(applicantLastName));
        fieldDTOS.add(Converters.convertDate(applicantBirthDate));
        fieldDTOS.add(Converters.convertBirthLocation(applicantBirthLocation));
        fieldDTOS.add(Converters.convertIdentityType("2"));
        fieldDTOS.add(Converters.convertIdentity("hgc"));
        fieldDTOS.add(Converters.convertIdentityType("4"));
        fieldDTOS.add(Converters.convertIdentity("hjc"));
        fieldDTOS.add(Converters.convertFirstGender("2"));
        fieldDTOS.add(Converters.convertMaritalStatus(applicantMaritalStatus));
        fieldDTOS.add(Converters.convertNationality("hg"));
        fieldDTOS.add(Converters.convertNumberOfDependents("2"));
        fieldDTOS.add(Converters.convertPositionOrTitle("1"));
        fieldDTOS.add(Converters.convertAddressType(applicantAddressType));
        fieldDTOS.add(Converters.convertAddressLine(applicantAddress));
        fieldDTOS.add(Converters.convertAddressLine("dghg"));
        fieldDTOS.add(Converters.convertAddressLine("dghg"));
        fieldDTOS.add(Converters.convertZipCode("fddt"));
        fieldDTOS.add(Converters.convertAddressPhone(applicantPhoneNumber));
        fieldDTOS.add(Converters.convertAddressPhone("12345607899"));
        fieldDTOS.add(Converters.convertAddressFax("eedffffff"));
        fieldDTOS.add(Converters.convertCity(applicantCity));
        fieldDTOS.add(convertAddressType("1"));
        fieldDTOS.add(convertAddressLine("asassa"));
        fieldDTOS.add(convertAddressLine("assa"));
        fieldDTOS.add(convertAddressLine("saassa"));
        fieldDTOS.add(convertZipCode("455"));
        fieldDTOS.add(convertAddressPhone("saas"));
        fieldDTOS.add(convertAddressPhone("assa"));
        fieldDTOS.add(convertAddressFax("sadda"));
        fieldDTOS.add(convertCity("sds"));
        fieldDTOS.add(convertAddressType("1"));
        fieldDTOS.add(convertAddressLine("asdss"));
        fieldDTOS.add(convertAddressLine("aassa"));
        fieldDTOS.add(convertAddressLine("dssd"));
        fieldDTOS.add(convertZipCode("545"));
        fieldDTOS.add(convertAddressPhone("asdas"));
        fieldDTOS.add(convertAddressPhone("asasd"));
        fieldDTOS.add(convertAddressFax("h"));
        fieldDTOS.add(convertCity("hgh"));
        fieldDTOS.add(convertLanguage("1"));
        fieldDTOS.add(convertAccountType("o"));
        fieldDTOS.add(convertMXPAccount("dfgfh"));
        fieldDTOS.add(convertBankAccount("ghgh"));
        fieldDTOS.add(convertAccountCurrency("xaf"));
        fieldDTOS.add(convertDebitProgramId("vhhj"));
        fieldDTOS.add(convertCreditLimit("453.25"));
        fieldDTOS.add(convertGuaranteeType("ghhj"));
        fieldDTOS.add(convertGuaranteeValue("12.01"));
        fieldDTOS.add(convertGuaranteeInfo("vbnbn"));
        fieldDTOS.add(convertTitle(holderTitle));
        fieldDTOS.add(convertName(holderFirstName));
        fieldDTOS.add(convertName(holderMiddleName));
        fieldDTOS.add(convertName(holderLastName));
        fieldDTOS.add(convertNameOnCard(nameOnCard));
        fieldDTOS.add(convertCorporateName("ghhjk"));
        fieldDTOS.add(convertCardProgramId("bhjh"));
        fieldDTOS.add(convertAutomaticManualCardNumber("f"));
        fieldDTOS.add(convertDate("1250/12/20"));
        fieldDTOS.add(convertPrimarySecondary(primarySecondary));
        fieldDTOS.add(convertPrimaryCard(primaryCard));
        fieldDTOS.add(convertNewCardDesign("p"));
        fieldDTOS.add(convertCardDesignFee("vbbv"));
        fieldDTOS.add(convertExpressDelivery("y"));
        fieldDTOS.add(convertDeliveryOperator("gfgh"));
        fieldDTOS.add(convertExpressDeliveryFee("ghgfg"));
        fieldDTOS.add(convertCardPersonalizationFee("sdsa"));
        fieldDTOS.add(convertCorrespondenceType("asdf"));
        fieldDTOS.add(convertClientType("I"));

        int size = 0;
        try (PrintWriter printWriter = new PrintWriter("application_file.txt")) {
            for (FieldDTO fieldDTO : fieldDTOS) {
                final String field = Justify.justifyField(fieldDTO);
                printWriter.print(field);
                size += field.length();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return size;
    }
}
