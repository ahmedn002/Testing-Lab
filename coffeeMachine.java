public class coffeeMachine {
    public boolean powerOn = false;
    public boolean lightOn = false;
    public boolean busy = false;

    public float money;
    private final float price = 10;

    public int coffeeAmount;

    public String openMachine(){
        if(!powerOn) {
            powerOn = true;
            lightOn = true;
            return "Machine powered on.";
        }
        else{
            return "The machine is already turned on.";
        }
    }

    public String closeMachine(){
        if(powerOn) {
            lightOn = false;
            powerOn = false;
            return "Machine powered off";
        }
        else{
            return "The machine is already turned off.";
        }
    }

    public String addMoney(float money){
        if (powerOn) {
            this.money = money;
            return "Money registered.";
        }
        else{
            return "The machine is turned off.";
        }
    }


    public String makeCoffee(int coffeeAmount){
        if(powerOn) {
            busy = true;
            int i= 0;
            if (money >= price) {
                while(money>= price && coffeeAmount > 0){
                    money -= price;
                    coffeeAmount --;
                    i++;
                }
            }

            else {
                return "Not enough balance";
            }

            busy = false;
            return i + " Cup(s) of coffee made. Change: " + (int)money;
        }
        else{
            return "The machine is turned off.";
        }
    }
}
