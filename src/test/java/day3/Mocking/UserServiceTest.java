package day3.Mocking;

import day3.Mocking.Sample1.UserManager;
import day3.Mocking.Sample1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testGetUsername() {

        // mock (fake) UserManager obj olustur
        UserManager userManager = mock(UserManager.class);

        // bagimliligi izole ettik
        when(userManager.getUsername(1)).thenReturn("GUL");

        UserService userService = new UserService(userManager);
        String username = userService.getUsername(1);
        assertEquals("GUL sonuc", username);

    }
}
