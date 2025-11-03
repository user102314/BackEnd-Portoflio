package BackEnd.Portfolio.repository;

import BackEnd.Portfolio.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    // Spring Data JPA fournit save(), findAll(), findById(), delete(), etc.
}