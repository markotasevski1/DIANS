package com.example.fullproject.Repository;

import com.example.fullproject.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UserModel,Integer> {
    Optional<UserModel> findByLoginAndPassword(String login, String password);

}
