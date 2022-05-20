public class atmMachine {

    public float balance = 0;
    public boolean authenticated = false;
    public boolean cardValidated = true;
    public boolean passwordValidated = true;

    public String enterCard(){
        if(cardValidated){
            return "Validated card";
        }
        else{
            return "Card not validated";
        }
    }

    public String enterPassword(){
        if(cardValidated){
            System.out.println("Enter Password");
            if(passwordValidated){
                authenticated = true;
                return "Successful login";
            }
            else{
                return "Wrong password";
            }
        }
        else{
            return "Enter card first";
        }
    }

    public String deposit(float money){
        if(authenticated){
            if(money >= 50 && money <=50000){
                balance += money;
                return "Successful deposit";
            }
            else{
                return "Enter valid amount";
            }
        }
        else{
            return "Not allowed";
        }
    }

    public String withdraw(float amount){
        if(authenticated){
            if(amount <= balance){
                balance -= amount;
                return "Successful withdraw";
            }
            else{
                return "Not enough balance";
            }
        }
        else{
            return "Not allowed";
        }
    }

    public String removeCard(){
        if(cardValidated){
            return "Card removed";
        }
        else{
            return "Not allowed";
        }
    }
}
