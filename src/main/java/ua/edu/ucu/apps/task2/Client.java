package ua.edu.ucu.apps.task2;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Client {
    @Id
    private Long id;
    private String name;
    private int age;
    private String sex;
    private String mail;
}
