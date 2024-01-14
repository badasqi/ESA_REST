package com.example.esalab3.service;

import com.example.esalab3.entity.Client;
import com.example.esalab3.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import java.util.Optional;

@Service
@EnableTransactionManagement
public class ClientService {
    private ClientRepository clientRepository;


    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    @Transactional
    public Client getClientById(Integer id) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        return clientOptional.orElse(null);
    }
    @Transactional
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
    @Transactional
    public Client updateClient(Integer id, Client clientDetails) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            client.setName(clientDetails.getName());
            client.setAddress(clientDetails.getAddress());
            client.setContact(clientDetails.getContact());
            client.setTariff(clientDetails.getTariff());
            client.setProvider(clientDetails.getProvider());
            // Другие сеттеры для обновления данных клиента
            return clientRepository.save(client);
        } else {
            return null;
        }
    }
    @Transactional
    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
    @Transactional
    public void deleteClientById(Integer id) {
    }
}

