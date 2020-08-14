package enumerations;

import java.security.PrivateKey;

public enum Title {
    MR("Mr"), MISS("Miss"), MRS("Mrs"), DR("Dr"), ENG("Eng."), HE("HE"), MESSRS("Messrs");
    private String val;

    Title(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
