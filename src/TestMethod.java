import DTO.FieldDTO;
import converters.Converters;
import services.Justify;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static converters.Converters.*;

public class TestMethod {
    public static void main(String[] args) {
        ArrayList<FieldDTO> fieldDTOS = new ArrayList<>();
        fieldDTOS.add(Converters.convertIden("ivhjfxc"));
        fieldDTOS.add(Converters.convertDate("1996/07/15"));
        fieldDTOS.add(Converters.convertIden("cdxuyhj"));
        fieldDTOS.add(Converters.convertIden("xwrhtbvcjrty"));
        fieldDTOS.add(Converters.convertCustomerType("a"));
        fieldDTOS.add(Converters.convertCustomerId("xghgrdy"));
        fieldDTOS.add(Converters.convertParentCustomer("sffh"));
        fieldDTOS.add(Converters.convertCustomerParentRelation("3"));
        fieldDTOS.add(Converters.convertPromoter("hdyu"));
        fieldDTOS.add(Converters.convertTitle("6"));
        fieldDTOS.add(Converters.convertName("twhgnhc"));
        fieldDTOS.add(Converters.convertName("ghdydt"));
        fieldDTOS.add(Converters.convertName("cgh"));
        fieldDTOS.add(Converters.convertDate("1976/05/15"));
        fieldDTOS.add(Converters.convertBirthLocation("gfxhghhchgh"));
        fieldDTOS.add(Converters.convertIdentityType("2"));
        fieldDTOS.add(Converters.convertIdentity("hgc"));
        fieldDTOS.add(Converters.convertIdentityType("4"));
        fieldDTOS.add(Converters.convertIdentity("hjc"));
        fieldDTOS.add(Converters.convertFirstGender("2"));
        fieldDTOS.add(Converters.convertMaritalStatus("2"));
        fieldDTOS.add(Converters.convertNationality("hg"));
        fieldDTOS.add(Converters.convertNumberOfDependents("2"));
        fieldDTOS.add(Converters.convertPositionOrTitle("1"));
        fieldDTOS.add(Converters.convertAddressType("rt"));
        fieldDTOS.add(Converters.convertAddressLine("dghg"));
        fieldDTOS.add(Converters.convertAddressLine("dghg"));
        fieldDTOS.add(Converters.convertAddressLine("dghg"));
        fieldDTOS.add(Converters.convertZipCode("fddt"));
        fieldDTOS.add(Converters.convertAddressPhone("12345657899"));
        fieldDTOS.add(Converters.convertAddressPhone("12345607899"));
        fieldDTOS.add(Converters.convertAddressFax("eedffffff"));
        fieldDTOS.add(Converters.convertCity("hbjbk"));
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
        fieldDTOS.add(convertTitle("1"));
        fieldDTOS.add(convertName("jhhghg"));
        fieldDTOS.add(convertName("nhjvbvg"));
        fieldDTOS.add(convertName("hjhgh"));
        fieldDTOS.add(convertNameOnCard("jhjhk"));
        fieldDTOS.add(convertCorporateName("ghhjk"));
        fieldDTOS.add(convertCardProgramId("bhjh"));
        fieldDTOS.add(convertAutomaticManualCardNumber("f"));
        fieldDTOS.add(convertDate("1250/12/20"));
        fieldDTOS.add(convertPrimarySecondary("p"));
        fieldDTOS.add(convertPrimaryCard("asdas"));
        fieldDTOS.add(convertNewCardDesign("p"));
        fieldDTOS.add(convertCardDesignFee("vbbv"));
        fieldDTOS.add(convertExpressDelivery("y"));
        fieldDTOS.add(convertDeliveryOperator("gfgh"));
        fieldDTOS.add(convertExpressDeliveryFee("ghgfg"));
        fieldDTOS.add(convertCardPersonalizationFee("sdsa"));
        fieldDTOS.add(convertCorrespondenceType("asdf"));
        fieldDTOS.add(convertClientType("I"));

        try (PrintWriter printWriter = new PrintWriter("generated_file.txt")) {
            int size = 0;
            for (FieldDTO fieldDTO : fieldDTOS) {
                final String field = Justify.justifyField(fieldDTO);
                printWriter.print(field);
                size += field.length();
            }
            System.out.println(size);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
