package Kolekcje.Stosy.SMS;

import java.util.ArrayDeque;
import java.util.Deque;

class MessageInbox {
    private Deque<Message> messageInbox;

    MessageInbox() {
        this.messageInbox = new ArrayDeque<>();
    }

    void addMessage(String messageContent) {
        Message message = new Message(messageContent);
        messageInbox.push(message);
    }

    Message deleteNewestMessage() {
        System.out.println("Removed " + messageInbox.peek());
        return messageInbox.pop();
    }

    void listMessages() {
        messageInbox
                .forEach(message -> System.out.println(message.toString()));

    }
}
