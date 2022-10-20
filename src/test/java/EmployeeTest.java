import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    @DisplayName("Testa desenvolvedor")
    void testDev(){
        Developer employee1 = new Developer("João","joao@gmail.com",10000.0);
        assertEquals(employee1.discountedSalary, 8000.0);
        Developer employee2 = new Developer("Cristiano Ronaldo","cr7@gmail.com",2500.0);
        assertEquals(employee1.discountedSalary, 2250.0);
    }

}