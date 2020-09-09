package task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message {

        private String userName;

        public LocalDateTime sendTime;

        private String text;

        public ArrayList<IChannel> channels;

        public ArrayList<IAttachment> attachments;


        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getText() {

                return text;
        }

        public void setText(String text) {
                this.text = text;

        }

        public List<IChannel> getChannels() {
                return channels;
        }

        public void setChannels(ArrayList<IChannel> channels) {
                this.channels = channels;
        }

        public ArrayList<IAttachment> getAttachments() {
                return attachments;
        }

        public void setAttachments(ArrayList<IAttachment> attachments) {
                this.attachments = attachments;
        }



}
