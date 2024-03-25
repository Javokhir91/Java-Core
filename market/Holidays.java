package ru.market;

public enum Holidays {
    MARCH_8("0803"),
    FEBRUARY_23("2302"),
    NEW_YEAR("0101");


    private final String code;
    Holidays(String code) {
        this.code= code;
    }

    public String getCode() {
        return code;
    }
}