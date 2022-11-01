public class Clock {
    
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock(){
        this.hour = 0;
        this.minute = 0;
    }

    public Clock(int hour, int minute){
        if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){
            this.hour = hour;
            this.minute = minute;
        }else{
            System.out.println("Error");
        }
        
    }

    public void setClock(int hour, int minute){
        if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){
            this.hour = hour;
            this.minute = minute; 
        }else{
            System.out.println("Error");
        }
    }

    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }

    public String formatTime(int time){
        String stringT = String.valueOf(time);
        if(time < 10){
            return "0" + stringT;
        }else{
            return stringT;
        }
    }

    public void displayTime(){
        System.out.println(formatTime(this.hour) + ":" + formatTime(this.minute));
    }

    public void addOneMinute(){
        this.minute ++;
        if(this.hour == this.alarmHour && this.minute == this.alarmMinute){
            System.out.println(runAlarm());
        }
    }

    public void setAlarm(int hour, int minute){
        if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){
            this.alarmHour = hour;
            this.alarmMinute = minute; 
        }else{
            System.out.println("Error");
        }
    }

    public String runAlarm(){
        return "beep-beep-beep!";
    }

    public static void main(String[] args){
        Clock c1 = new Clock(4, 3);
        c1.displayTime();
        c1.setClock(14,15);
        c1.displayTime();
        c1.setAlarm(14, 16);
        c1.addOneMinute();
        c1.displayTime();     
    }

}
