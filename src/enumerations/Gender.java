package enumerations;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        String val = super.toString();
        val = val.toLowerCase();
        char firstCharacter = val.charAt(0);
        return Character.toUpperCase(firstCharacter) + val.substring(1);
    }
}
