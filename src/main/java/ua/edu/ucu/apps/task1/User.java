package ua.edu.ucu.apps.task1;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
}
