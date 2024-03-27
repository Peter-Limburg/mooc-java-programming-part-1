import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;
    public MessagingService() {
        messages = new ArrayList<>();
    }
    public void add(Message message) {
        int characters = message.getContent().length();
        if (characters <= 280) {
            messages.add(message);
        }
        else {
            System.out.println("Message not added. Content exceeds 280 characters.");
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
