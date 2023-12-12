package ua.edu.ucu.apps.task2;

import java.util.List;

import com.mailjet.client.errors.MailjetException;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetException {
        for (int i = 0; i < infos.size(); i++) {
            MailSender.sendMail(infos.get(i));
        }
    }
}
