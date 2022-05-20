import org.junit.Assert;
import org.junit.Test;

public class testCoffeeMachine {

    @Test
    public void test1(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
    }

    @Test
    public void test2(){
        coffeeMachine c= new coffeeMachine();
        c.powerOn = true;
        Assert.assertEquals("The machine is already turned on.", c.openMachine());
    }

    @Test
    public void test3(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("The machine is turned off.", c.addMoney(30));
    }

    @Test
    public void test4(){
        coffeeMachine c = new coffeeMachine();
        c.openMachine();
        Assert.assertEquals("Money registered.", c.addMoney(30));
    }

    @Test
    public void test5(){
        coffeeMachine c = new coffeeMachine();
        c.openMachine();
        c.closeMachine();
        Assert.assertEquals("The machine is turned off.", c.addMoney(30));
    }

    @Test
    public void test6(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
        Assert.assertEquals("Money registered.", c.addMoney(30));
    }

    @Test
    public void test7(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
        Assert.assertEquals("Money registered.", c.addMoney(30));
        Assert.assertEquals("Machine powered off", c.closeMachine());
    }

    @Test
    public void test8(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("The machine is turned off.", c.makeCoffee(2));
    }

    @Test
    public void test9(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
        Assert.assertEquals("Money registered.", c.addMoney(30));
        Assert.assertEquals( "3 Cup(s) of coffee made. Change: 0", c.makeCoffee(3));
    }

    @Test
    public void test10(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
        Assert.assertEquals("Money registered.", c.addMoney(30));
        Assert.assertEquals("3 Cup(s) of coffee made. Change: 0", c.makeCoffee(4));
    }

    @Test
    public void test11(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
        Assert.assertEquals("Money registered.", c.addMoney(30));
        Assert.assertEquals("1 Cup(s) of coffee made. Change: 20", c.makeCoffee(1));
    }

    @Test
    public void test12(){
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("Machine powered on.", c.openMachine());
        Assert.assertEquals("Money registered.", c.addMoney(30));
        Assert.assertEquals("2 Cup(s) of coffee made. Change: 10", c.makeCoffee(2));
        Assert.assertEquals("Machine powered off", c.closeMachine());
    }
}