package Kolekcje.Stosy.SMS;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String messageContent;
    private LocalDateTime messageReceiveDate;

     Message(String messageContent) {
        this.messageContent = messageContent;
        this.messageReceiveDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return messageContent +
                " at: " + messageReceiveDate.format(DateTimeFormatter.ofPattern("HH:mm:ss dd:MM:yyyy"));
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public LocalDateTime getMessageReceiveDate() {
        return messageReceiveDate;
    }

    public void setMessageReceiveDate(LocalDateTime messageReceiveDate) {
        this.messageReceiveDate = messageReceiveDate;
    }
}

