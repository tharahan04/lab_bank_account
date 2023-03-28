import org.assertj.core.api.AssertionsForClassTypes;
import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @BeforeEach

    void depositTest() {
        BankAccount bankAccount = new BankAccount("Tharahan",
                "Tharmaraja",
                LocalDate.of(2000, 3, 4),
                12345678);
    }


    @Test
    void withdrawalTest(){
        BankAccount bankAccount = new BankAccount("Tharahan",
            "Tharmaraja",
            LocalDate.of(2000, 3, 4),
            12345678);

    }





}
