import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdministratorTest {

    @Test
    public void testGetEmail() {
        Administrator admin = new Administrator();
        assertEquals("admin@gmail.com", admin.getEmail());
    }

    @Test
    public void testGetPassword() {
        Administrator admin = new Administrator();
        assertEquals("123", admin.getPassword());
    }
}
