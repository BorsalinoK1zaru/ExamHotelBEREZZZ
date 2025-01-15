package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    Client getClientById(Integer id);
    List<Client> getAllClients();
    Client updateClient(Integer id, Client client);
    void deleteClientById(int id);
}
