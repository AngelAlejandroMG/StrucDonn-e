package org.example;

import org.example.facture.Client;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        List<Client> clients = new ArrayList<Client>();

        Client client1 = new Client(100, "Montes", "Angel", 10000000  );
        Client client2 = new  Client(101, "Lussier", "Nathan", 1000000);
        Client client3 = new  Client(102, "Felipe", "Daniel", 1000000);
        Client client4 = new  Client(103, "Saint-Fermin", "Ellyn", 1000000);
        clients.add(client1);

    }
}
