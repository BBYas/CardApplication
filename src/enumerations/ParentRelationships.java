package enumerations;

public enum ParentRelationships {
    SON("Son"),GRAND_SON("Grand Son"), DAUGHTER("Daughter"),
    GRAND_DAUGHTER("Grand Son"), FATHER("Father"),
    STEP_FATHER("Step Father"),MOTHER("Mother"),
    STEP_MOTHER("Step Mother"), GRAND_FATHER("Grand Father"),
    GRAND_MOTHER("Grand Mother"), SISTER("Sister"),
    BROTHER("Brother"), WIFE("Wife");

    private String val;

    ParentRelationships(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
