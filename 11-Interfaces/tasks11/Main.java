public class Main {
    public static void main(String[] args){
        TV t = new TV();
        t.on();
        t.displayStatus();
        t.channelUp();
        t.displayStatus();
        t.setChannel(7);
        t.setChannel(142);
        t.displayStatus();
        t.channelDown();
        t.displayStatus();
        t.off();
        t.displayStatus();
    }
}
