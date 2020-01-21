package Kolekcje.Kolejki.QueueOFClients;

import lombok.Getter;

import java.time.LocalTime;
import java.util.PriorityQueue;

@Getter
public class WaitingRoom {
    PriorityQueue<Client> clientPriorityQueue;

    WaitingRoom(PriorityQueue<Client> clientPriorityQueue) {
        this.clientPriorityQueue = clientPriorityQueue;
    }

    void addClient(String name, LocalTime time, boolean isPriority) {
        Client client = new Client(name, isPriority);
    }

    Client getClient() {
        return clientPriorityQueue.element();
    }

    void printAllClients() {

        do {
            System.out.println(clientPriorityQueue.poll()); //poll returns and removes element
        } while (clientPriorityQueue.size() > 0);
    }

}
