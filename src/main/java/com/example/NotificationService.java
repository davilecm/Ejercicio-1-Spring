package com.example;

import org.springframework.stereotype.Component;


@Component
public class NotificationService {


    public NotificationService(){

        System.out.println("Ejecutando constructor Notificacion");
    }

    public String holaMundo(){

        return "Hola Mundo";
    }
}
