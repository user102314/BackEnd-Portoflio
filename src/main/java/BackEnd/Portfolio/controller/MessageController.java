package BackEnd.Portfolio.controller;

import BackEnd.Portfolio.model.Message;
import BackEnd.Portfolio.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/messages")
@AllArgsConstructor
public class MessageController {

    private final MessageService messageService;

    // Endpoint: POST /api/messages
    @PostMapping
    // HttpStatus.CREATED (201) indique qu'une nouvelle ressource a été créée
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        Message savedMessage = messageService.saveMessage(message);
        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
    }
}