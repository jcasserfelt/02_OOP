package Sprint2.ScannersMM.Inlamning2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GymTest {


    Customer testPersonNotInList = new Customer("Test Name", "199001015989", LocalDate.now().minusDays(1));
    String correctName = "Test Name";
    String inCorrectName = "sdkalfjkjashdflk";
    String correctPersonNr = "199001015989";
    Customer testPerson = new Customer(correctName, correctPersonNr, LocalDate.now().minusDays(1));


    @Test
    void findCustomer() {
        Gym.customerRegister.add(testPerson);
        assertEquals(testPerson, Gym.findCustomer(correctName));
        assertNotEquals(testPerson, Gym.findCustomer(inCorrectName));

        assertTrue(Gym.findCustomer("Test Name").getName().equalsIgnoreCase("Test Name"));
        assertTrue(Gym.findCustomer("199001015989").getPersonNr().equalsIgnoreCase(testPerson.getPersonNr()));

    }

    @Test
    void scanCustomerFile() {

    }

    @Test
    void customerCheckIn() {


    }
}