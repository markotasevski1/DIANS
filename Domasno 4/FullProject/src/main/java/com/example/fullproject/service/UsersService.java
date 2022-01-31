package com.example.fullproject.service;

import com.example.fullproject.Repository.UsersRepository;
import com.example.fullproject.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UserModel registerUser(String login, String password, String email)
    {
        if(login!= null && password!=null)
        {
            UserModel userModel=new UserModel();
            userModel.setLogin(login);
            userModel.setPassword(password);
            userModel.setEmail(email);
            return usersRepository.save(userModel);
        }
        else{
            return null;
        }
    }
    public UserModel authenticate(String login, String password)
    {
        return usersRepository.findByLoginAndPassword(login,password).orElse(null);
    }
}
