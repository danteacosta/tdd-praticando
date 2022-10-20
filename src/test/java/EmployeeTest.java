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
        assertEquals(employee2.discountedSalary, 2250.0);
        Developer employee3 = new Developer("Lionel Messi","messi@gmail.com",3000.0);
        assertEquals(employee3.discountedSalary, 2400.0);
    }
    @Test
    @DisplayName("Testa DBA")
    void testDBA(){
        DBA employee1 = new DBA("Alan Turing","turing@gmail.com",10000.0);
        assertEquals(employee1.discountedSalary, 7500.0);
        DBA employee2 = new DBA("Ada Lovelace","lovelace@outlook.com",1500.0);
        assertEquals(employee2.discountedSalary, 1275.0);
        DBA employee3 = new DBA("Grace Hopper","grace@gmail.com",2000.0);
        assertEquals(employee3.discountedSalary, 1500.0);
    }
    @Test
    @DisplayName("Testa Testador")
    void testTestador(){
        Tester employee1 = new Tester("Daemon Targaryen","daemon@gmail.com",10000.0);
        assertEquals(employee1.discountedSalary, 7500.0);
        Tester employee2 = new Tester("Alicent Hightower","hightower@outlook.com",1500.0);
        assertEquals(employee2.discountedSalary, 1275.0);
        Tester employee3 = new Tester("Bill Gates","bill@outlook.com",2000.0);
        assertEquals(employee3.discountedSalary, 1500.0);
    }
    @Test
    @DisplayName("Testa Gerente")
    void testManager(){
        Manager employee1 = new Manager("Logan Roy","logan@gmail.com",10000.0);
        assertEquals(employee1.discountedSalary, 7000.0);
        Manager employee2 = new Manager("Elvis Presley","ep@outlook.com",1500.0);
        assertEquals(employee2.discountedSalary, 1200.0);
        Manager employee3 = new Manager("Bilbo Baggings","hobbit@outlook.com",5000.0);
        assertEquals(employee3.discountedSalary, 3500.0);
    }


}