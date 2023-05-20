package day3;

public class FirstTwoLastTwoSame {

    public boolean firstTwoLastTwoSame(String str) {
        if (str.length() < 2) return false;
        if (str.length() == 2) return true;
        return str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2));
    }
}
