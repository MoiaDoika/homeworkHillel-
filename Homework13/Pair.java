package Homework13;

import java.util.Locale;

public class Pair {
    private String lowerCase;
    private String upperCase;

    public Pair(String lowerCase) {
        this.lowerCase = lowerCase;
        this.upperCase = lowerCase.toUpperCase(Locale.ROOT);
    }

    public void setLowerCase(String lowerCase) { this.lowerCase = lowerCase;}

    public void setUpperCase() { this.upperCase = this.lowerCase.toUpperCase(Locale.ROOT);}

    public String getLowerCase() { return lowerCase;}

    public String getUpperCase() { return upperCase;}

    @Override
    public String toString() {
        return "{" +
                lowerCase + '\'' +", "+
                upperCase + '\'' +
                '}';
    }
}
