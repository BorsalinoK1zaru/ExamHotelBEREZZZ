package com.example.demo.service.impl;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;


    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Integer id) {
        return  clientRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Client not found")
        );
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Integer id, Client client) {
        if(clientRepository.existsById(id)){
            throw new RuntimeException("client not found");
        }

        client.setPassport(id);
        return clientRepository.save(client);
    }

    @Override
    public void deleteClientById(int id) {
        clientRepository.deleteById(id);
    }
}