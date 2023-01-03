public abstract class Message {
    
    private String text;


    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message() {
        this.text = "";
    }

    public Message(String text) {
        this.text = text;
    }

    public int charNumber(){
        return this.text.length();
    }

    public abstract void send();

}
