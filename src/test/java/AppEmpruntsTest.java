import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
class AppEmpruntsTest {

    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> AppEmprunts.main(new String[1]));
    }
}