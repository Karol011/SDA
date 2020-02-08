package Kolekcje.Stosy.SMS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

class Phone {
    private Map<String, MessageInbox> phone;
    // TODO: 22.01.2020


    public Phone(Map<String, MessageInbox> phone) {
        this.phone = phone;
    }

    void addMessagePhone(String contact, String message) {
        if (phone.containsKey(contact)) {
            phone.get(contact).addMessage(message);
        } else {
            Deque<Message> messageDeque = new ArrayDeque<>();
            MessageInbox messageInbox = new MessageInbox(messageDeque);
            messageInbox.addMessage(message);
            phone.put(contact, messageInbox);
        }
    }

    void listMessages(String contact) {
        System.out.println("Inbox of " + contact + ":");
        phone.get(contact).listMessages();
        System.out.println();

    }

    public Message removeFirstMessageFromContact(String contact) {
        if (phone.get(contact).getMessageInbox().size() > 0) {
            phone.get(contact).deleteNewestMessage();
        } else {
            System.out.println("Inbox of contact " + contact + " is empty");
        }
        return phone.get((contact)).getMessageInbox().peek();
    }

}
