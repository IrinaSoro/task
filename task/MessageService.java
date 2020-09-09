package task;

import java.util.ArrayList;

public class MessageService {

    private  IAttachmentFilter attachmentFilter;

    public MessageService()

    {
        attachmentFilter = new AttachmentFilter();
    }

    public void SendMessage(Message message)
    {
        ArrayList<IAttachment> attachments;

        for (IChannel channel : message.channels)
        {
            attachments = attachmentFilter.FilterOutAttachments(channel, message.attachments);

            channel.ReceiveMessage(message,attachments);
        }

       System.out.println("Sending a message finished success");
    }
}


