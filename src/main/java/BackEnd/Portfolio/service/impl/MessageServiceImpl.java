package BackEnd.Portfolio.service.impl;

import BackEnd.Portfolio.model.Message;
import BackEnd.Portfolio.repository.MessageRepository;
import BackEnd.Portfolio.service.MessageService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor // Injection par constructeur grâce à Lombok
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public Message saveMessage(Message message) {
        // Logique métier si nécessaire (ex: validation, envoi d'email de notification)
        return messageRepository.save(message);
    }
}