package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService saludo;


    public UserService(NotificationService saludo){

        System.out.println("Ejecutando constructor Userservice");
        this.saludo = saludo;

    }

}
