package enumerations;

public enum IdentityType {

    CIVIL_ID("Civil Id"), PASSPORT("Passport"),
    DRIVER_LICENSE("Driver License"), EMPLOYMENT_ID("Employment Id"),
    RESIDENCE_CARD("Residence Card"), FAMILY_BOOK("Family Book"),
    SOCIAL_SEC_NUM("Social Sec. Num.");

    private String val;

    IdentityType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
