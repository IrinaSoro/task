package task;

import java.util.ArrayList;
import java.util.List;

public interface IChannel {

    void receiveMessage(Message message , ArrayList<IAttachment> attachments );

}
