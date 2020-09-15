package task;

import java.util.ArrayList;
import java.util.List;
public interface IAttachmentFilter {

    ArrayList<IAttachment> filterOutAttachments(IChannel channel, ArrayList<IAttachment> attachments);
}
