package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.util.*;

public class Users {

    //Что то пошло не так у меня с этим классом:D
    //Потом додумаю

    private String name_password;
    private String age;


    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name_password='" + name_password + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName_password() {
        return name_password;
    }

    public Users(String name_password, String age) {
        this.name_password = name_password;
        this.age = age;
    }

    public Users() {
    }


}