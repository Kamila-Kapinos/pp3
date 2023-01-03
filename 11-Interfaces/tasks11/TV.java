public class TV implements CanOnOff, CanChangeChannel {

    private boolean isOn;
    private int channelNo;

    public TV() {
        this.isOn = false;
        this.channelNo = 1;
    }

    public boolean isIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public int getChannelNo() {
        return channelNo;
    }

    @Override
    public void off() {
        this.isOn = false;
        // TODO Auto-generated method stub
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        this.isOn = true;
    }

    @Override
    public void setChannel(int channelNo) {
        if (getIsOn() && channelNo >= 1 && channelNo <= 99) {
            this.channelNo = channelNo;
        }
        // TODO Auto-generated method stub
    }

    @Override
    public void channelDown() {
        if (getIsOn() && getChannelNo() > 1) {
            this.channelNo--;
        }
        // TODO Auto-generated method stub

    }

    @Override
    public void channelUp() {
        if (getIsOn() && getChannelNo() < 99) {
            this.channelNo++;
        }
        // TODO Auto-generated method stub
    }

    public void displayStatus() {
        //TODO "?"
        if (getIsOn()) {
            System.out.println("TV is on");
            System.out.println("TV channel is: " + getChannelNo());
        }else{
            System.out.println("TV is off");
        }
    }
}
