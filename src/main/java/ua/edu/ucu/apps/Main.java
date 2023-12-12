package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task1.Student;
import ua.edu.ucu.apps.task1.User;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Oles").age(32).mark(61).mark(100).gender("m").build();
        System.out.println(user);
    }
    
}
