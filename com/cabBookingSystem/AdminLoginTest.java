import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

class AdminLoginTest {

    private JTextField usernameField;
    private JPasswordField passwordField;

    @BeforeEach
    void setup() {
        usernameField = new JTextField();
        passwordField = new JPasswordField();
    }

    @Test
    void testCorrectAdminCredentials() {
        usernameField.setText("Ebad");
        passwordField.setText("admin");

        boolean isValid = usernameField.getText().equals("Ebad") &&
                          new String(passwordField.getPassword()).equals("admin");

        assertTrue(isValid, "Admin credentials should be valid.");
    }

    @Test
    void testIncorrectAdminCredentials() {
        usernameField.setText("wrongUser");
        passwordField.setText("wrongPass");

        boolean isValid = usernameField.getText().equals("Ebad") &&
                          new String(passwordField.getPassword()).equals("admin");

        assertFalse(isValid, "Admin credentials should be invalid.");
    }
}