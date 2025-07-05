import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

class HomeWindowTest {

    private JButton loginAsAdminButton;
    private JButton loginAsPassengerButton;
    private JButton loginAsCabOwnerButton;

    @BeforeEach
    void setup() {
        loginAsAdminButton = new JButton("Login as Admin");
        loginAsPassengerButton = new JButton("Login as Passenger");
        loginAsCabOwnerButton = new JButton("Login as Cab Owner ");
    }

    @Test
    void testAdminButtonExists() {
        assertNotNull(loginAsAdminButton, "Admin login button should exist.");
        assertEquals("Login as Admin", loginAsAdminButton.getText());
    }

    @Test
    void testPassengerButtonExists() {
        assertNotNull(loginAsPassengerButton, "Passenger login button should exist.");
        assertEquals("Login as Passenger", loginAsPassengerButton.getText());
    }

    @Test
    void testCabOwnerButtonExists() {
        assertNotNull(loginAsCabOwnerButton, "Cab Owner login button should exist.");
        assertEquals("Login as Cab Owner ", loginAsCabOwnerButton.getText());
    }
}