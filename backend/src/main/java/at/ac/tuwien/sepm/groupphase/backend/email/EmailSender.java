package at.ac.tuwien.sepm.groupphase.backend.email;

public interface EmailSender {
    void send(String to, String email);
}
