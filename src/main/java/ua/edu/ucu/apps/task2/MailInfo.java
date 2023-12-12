package ua.edu.ucu.apps.task2;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;
    private MailCode mailcode;

    public Collection<?> makeSubject() {
        return null;
    }
    public Collection<?> makeText() {
        return null;
    }
    public Collection<?> makeHTML() {
        return null;
    }

}
