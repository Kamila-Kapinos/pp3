public class Email extends Message{

    private String subject;
    private String recipient;


    public Email(String subject, String recipient) {
        this.subject = subject;
        this.recipient = recipient;
    }


    public Email(String text, String subject, String recipient) {
        super(text);
        this.subject = subject;
        this.recipient = recipient;
    }


    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }


    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Subject: " + getSubject() + "\nFrom: " + getRecipient() + "\nContent: " + getText());
        
    }
    
}
