public class Clock {
    
    int hour;
    int minute;
    int alarmHour = -1;
    int alarmMinute = -1;

    public boolean checkTime(int h, int m){
        if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){
            return true;
        }
        return false;
    }

    public Clock(){
        this.hour = 0;
        this.minute = 0;
    }

    public Clock(int hour, int minute){
        if(checkTime(hour, minute)){
            this.hour = hour;
            this.minute = minute;
        }else{
            System.out.println("Error");
        }       
    }

    public void setClock(int hour, int minute){
        if(checkTime(hour, minute)){
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

    public String displayTime(){
        return String.format("%02d:%02d", this.hour, this.minute);
        //System.out.println(formatTime(this.hour) + ":" + formatTime(this.minute));
    }
    
    public void addOneMinute(){
        this.minute ++;
        if(!checkTime(this.hour, this.minute)){
            this.hour = 0;
            this.minute = 0;
        }else if(this.minute > 59){
            this.hour ++;
            this.minute = 0;
        }
        
        if(this.hour == this.alarmHour && this.minute == this.alarmMinute){
            System.out.println(runAlarm());
        }
    }

    public void setAlarm(int alarmHour, int alarmMinute){
        if(checkTime(alarmHour, alarmMinute)){
            this.alarmHour = alarmHour;
            this.alarmMinute = alarmMinute; 
        }else{
            System.out.println("Error");
        }
    }

    public String runAlarm(){
        return "beep-beep-beep!";
    }

    public static void main(String[] args){
        Clock c1 = new Clock(2, 47);
        System.out.println(c1.displayTime());
        c1.setClock(18, 14);
        c1.displayTime();
        c1.setClock(9, 3);
        c1.displayTime();
        c1.setClock(23, 59);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();     
    }

}
