package ru.crud.h2dz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.crud.h2dz.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {



}
