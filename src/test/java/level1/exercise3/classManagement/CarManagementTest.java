package level1.exercise3.classManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarManagementTest {

    @Test
    void triggerOutOfBounds() {
        CarManagement carManagement = new CarManagement();
        assertThrows(ArrayIndexOutOfBoundsException.class, carManagement::triggerOutOfBounds, "Expected ArrayIndexOutOfBoundsException to be thrown");
    }
}