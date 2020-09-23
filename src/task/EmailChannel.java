package task;

import java.util.ArrayList;
import java.util.List;

public class EmailChannel extends AbstractChannel {
    @Override
    public void sendMessage(Message message) {
       /* System.out.println("Email receive message \n" + "Name: " + message.getUserName() + "\nSend time: "+ message.sendTime
        + "\nContent: "+ message.getText());
        System.out.println(message +"\n");
        if (attachments != null && attachments.size() > 0)
        {
            for (IAttachment attachment : attachments){
                System.out.println(attachment.toString());
            }
        }*/
    }
}