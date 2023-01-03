public class SMS extends Message{
    
    private String number;


    public SMS(String number) {
        this.number = number;
    }

    public SMS(String text, String number) {
        super(text);
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Sending SMS...");
        System.out.println("Message from number: " + getNumber() + "\nContent: " + getText());
        
    }

    
}
