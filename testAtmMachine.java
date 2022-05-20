import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class testAtmMachine {

    @Test
    public void test1(){
        atmMachine a = new atmMachine();
        a.cardValidated = false;
        assertEquals("Card not validated",a.enterCard());
    }
    @Test
    public void test2(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
    }
    @Test
    public void test3(){
        atmMachine a = new atmMachine();
        assertEquals("Successful login",a.enterPassword());
    }
    @Test
    public void test4(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        a.passwordValidated = false;
        assertEquals("Wrong password",a.enterPassword());
    }
    @Test
    public void test5(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test6(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(20));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test7(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(50));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test8(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test9(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(50001));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test10(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(500));
        assertEquals("Successful withdraw",a.withdraw(500));
    }
    @Test
    public void test11(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(500));
        assertEquals("Not enough balance",a.withdraw(501));
    }
    @Test
    public void test12(){
        atmMachine a = new atmMachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(3000));
        assertEquals("Successful withdraw",a.withdraw(1000));
        assertEquals("Not enough balance",a.withdraw(4000));
        assertEquals("Successful withdraw",a.withdraw(2000));
    }
}

