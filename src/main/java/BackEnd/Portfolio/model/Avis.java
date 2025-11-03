package BackEnd.Portfolio.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "avis")
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomClient;

    // Par exemple, l'entreprise ou le titre du projet
    private String entreprise;

    @Lob
    @Column(nullable = false)
    private String commentaire;

    @Column(nullable = false)
    private int note; // Note de 1 à 5

    @Column(nullable = false)
    private boolean approuve = false; // Pour la modération avant affichage public

    // Pas besoin de constructeurs et de Getters/Setters si vous utilisez @Data de Lombok
}