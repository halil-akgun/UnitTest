package day3.Mocking.Sample1;

public class UserService {

    private UserManager userManager;

    public UserService(UserManager userManager) {
        this.userManager = userManager;
    }

    public String getUsername(int userId) {
        return userManager.getUsername(userId) + " sonuc";
    }
}
