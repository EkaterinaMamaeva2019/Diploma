package ru.netology.diploma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.diploma.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
}
