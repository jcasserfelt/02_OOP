package Sprint2.ScannersMM.Inlamning2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customerWithCard = new Customer("Anders Andersson", "199012121234", LocalDate.now().minusDays(1));
    private Customer customerNoCard = new Customer("Lars Larsson", "198011111234", LocalDate.now().minusYears(2));
    private Customer customerNoName = new Customer("", "", LocalDate.now().minusYears(2));
    private Customer customerPaidToday = new Customer("", "", LocalDate.now());


    @Test
    void hasValidTrainingCard() {
        assertTrue(customerWithCard.hasValidTrainingCard());
        assertFalse(customerNoCard.hasValidTrainingCard());
    }

    @Test
    void isMember() {
        assertFalse(customerNoName.isMember()); // no name = not found in list
        Gym.customerRegister.add(customerWithCard);
        assertTrue(Gym.customerRegister.add(customerWithCard));
        assertTrue(customerWithCard.isMember());
    }

    @Test
    void getTrainingCardExpiryDate() {
        assertEquals(customerPaidToday.getTrainingCardExpiryDate(), LocalDate.now().plusYears(1));
        assertNotEquals(customerPaidToday.getTrainingCardExpiryDate(), LocalDate.now());

    }
}