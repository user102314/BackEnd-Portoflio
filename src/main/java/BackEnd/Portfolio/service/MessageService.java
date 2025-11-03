package BackEnd.Portfolio.service;

import BackEnd.Portfolio.model.Message;

public interface MessageService {
    // Opération pour ajouter un nouveau message
    Message saveMessage(Message message);
}