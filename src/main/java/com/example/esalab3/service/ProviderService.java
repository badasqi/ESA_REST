package com.example.esalab3.service;

import com.example.esalab3.entity.Provider;
import com.example.esalab3.repository.ClientRepository;
import com.example.esalab3.repository.ProviderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import java.util.Optional;

@Service
@EnableTransactionManagement
public class ProviderService {
    private ProviderRepository providerRepository;


    @Autowired
    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Transactional
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    @Transactional
    public Provider getProviderById(Integer id) {
        Optional<Provider> providerOptional = providerRepository.findById(id);
        return providerOptional.orElse(null);
    }

    @Transactional
    public Provider addProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    @Transactional
    public Provider updateProvider(Integer id, Provider providerDetails) {
        Optional<Provider> providerOptional = providerRepository.findById(id);
        if (providerOptional.isPresent()) {
            Provider provider = providerOptional.get();
            provider.setName(providerDetails.getName());
            return providerRepository.save(provider);
        } else {
            return null;
        }
    }

    @Transactional
    public void deleteProvider(Integer id) {
        providerRepository.deleteById(id);
    }

}