package enumerations;

public enum MaritalStatus {
    SINGLE,MARRIED,DIVORCED,WIDOWER,SEPARATED;

    @Override
    public String toString() {
        String val = super.toString();
        val = val.toLowerCase();
        char firstCharacter = val.charAt(0);
        return Character.toUpperCase(firstCharacter) + val.substring(1);
    }
}
