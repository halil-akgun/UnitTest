package day3.Mocking.Sample1;

public class UserManager {

    public String getUsername(int userId) {

        if (userId == 1) return "GUL";
        else if (userId == 2) return "Halise";
        else return "unknown";

    }
}
