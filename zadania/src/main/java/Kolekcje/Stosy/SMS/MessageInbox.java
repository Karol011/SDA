package Kolekcje.Stosy.SMS;

import lombok.Getter;

import java.util.ArrayDeque;
import java.util.Deque;
@Getter
class MessageInbox {
    private Deque<Message> messageInbox;

    MessageInbox() {
        this.messageInbox = new ArrayDeque<>();
    }

    public MessageInbox(Deque<Message> messageInbox) {
        this.messageInbox = messageInbox;
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

    @Override
    public String toString() {
        return "MessageInbox{" +
                "messageInbox=" + messageInbox +
                '}';
    }
}
