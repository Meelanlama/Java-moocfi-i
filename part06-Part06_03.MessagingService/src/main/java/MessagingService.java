
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class MessagingService {

    private ArrayList<Message> msg;

    public MessagingService() {
        this.msg = new ArrayList<>();
    }

    public void add(Message message) {
        //checking if message content is less than 280 character, getting the content with getContent() method string and length() checks the length of string chracter.
        if (message.getContent().length() <= 280) {
            //if msg content is  less then it is added to list msg;
              msg.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.msg;
    }
}
