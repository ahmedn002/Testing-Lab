public class digitalWatch {
    public boolean open = false;
    public boolean timerSet = false;
    public float timer = 0;

    public String turnOn(){
        if(!open){
            open = true;
            return "Turned On!";
        }
        else{
            return "Already turned on";
        }
    }

    public String setTimer(float time){
        if(open){
            timer = time;
            timerSet = true;
            return "Timer set";
        }
        else{
            return "Watch os closed";
        }
    }

    public String doSomething(){
        if(timerSet){
            return "Wait for timer to end";
        }
        else{
            return "Accepted";
        }
    }

    public String turnOff(){
        if(open){
            open = false;
            return "Turned off";
        }
        else{
            return "Error";
        }
    }
}