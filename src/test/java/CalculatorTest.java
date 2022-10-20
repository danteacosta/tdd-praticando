import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Testa desenvolvedor")
    void testDev(){
        Employee employee = new Employee("João","joao@gmail.com",10000.0,DEV);
    }
}