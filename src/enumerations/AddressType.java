package enumerations;

public enum AddressType {
    MAILING_ADDRESS("Mail Address"),
    EMPLOYER_ADDRESS("Employer Address"),
    RESIDENCE_ADDRESS("Residence Address"),
    MAILING_ADDRESS_2D("Mailing Address 2D");
    private String val;

    AddressType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
