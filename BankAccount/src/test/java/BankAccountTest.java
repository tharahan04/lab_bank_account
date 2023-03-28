import org.example.BankAccount;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BankAccountTest {
    @Test

    void depositTest() {
        BankAccount bankAccount = new BankAccount("Tharahan", "Tharmaraja", LocalDate.of(2000, 3, 4), 12345678);
    }
}
