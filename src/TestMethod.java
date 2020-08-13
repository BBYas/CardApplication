import DTO.FieldDTO;
import services.Justify;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static converters.Converters.*;

public class TestMethod {
    public static void main(String[] args) {
        ArrayList<FieldDTO> fieldDTOS = new ArrayList<>();
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
            for (FieldDTO fieldDTO : fieldDTOS) {
                printWriter.print(Justify.justifyField(fieldDTO));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
