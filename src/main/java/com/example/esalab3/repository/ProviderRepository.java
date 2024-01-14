package com.example.esalab3.repository;

import com.example.esalab3.entity.Client;
import com.example.esalab3.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer> {
    // Дополнительные методы для работы с провайдерами могут быть добавлены здесь,
    // но Spring Data JPA предоставляет базовые CRUD методы из коробки.
    // Например, можно создать методы поиска провайдеров по определенным критериям.
    List<Provider> findAll();

    // Поиск клиента по его идентификатору
    Optional<Provider> findById(Integer id);

    // Удаление клиента по его идентификатору
    void deleteById(Integer id);
}
