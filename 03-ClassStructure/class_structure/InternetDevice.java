public class InternetDevice {
    static int connectedDevices;
    String deviceName;
    private boolean isConnected;
    
    public InternetDevice(String deviceName){
        this.deviceName = deviceName;
    }

    public void connect(){
        this.isConnected = true;
        connectedDevices ++;
    }

    public void disconnect(){
        this.isConnected = false;
        connectedDevices --;
    }

    public boolean isConnected(){
      return this.isConnected;
    }

    public void displayStatus(){;
        System.out.println("Name: " + this.deviceName + "/nIs connected: " + isConnected());
    }

    public static void displayConnections(){
        System.out.println("The number of connections to the internet is: " + connectedDevices);
    }



}
