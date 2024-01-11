package ru.netology.diploma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.diploma.entity.TokenEntity;

@Repository
public interface TokenRepository extends CrudRepository<TokenEntity, String> {
}
