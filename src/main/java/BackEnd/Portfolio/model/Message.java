package BackEnd.Portfolio.model;

import jakarta.persistence.*;
// Importation de Lombok pour réduire le code (getters/setters/constructeurs)
import lombok.Data;

@Entity
@Data // Génère Getters, Setters, toString, equals, hashCode
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String sujet;

    @Lob // Pour stocker de grands blocs de texte
    @Column(nullable = false)
    private String contenu;

    // Pas besoin de constructeurs et de Getters/Setters si vous utilisez @Data de Lombok
}