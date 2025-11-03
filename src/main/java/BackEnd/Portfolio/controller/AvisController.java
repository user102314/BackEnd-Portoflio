package BackEnd.Portfolio.controller;

import BackEnd.Portfolio.model.Avis;
import BackEnd.Portfolio.service.AvisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/avis")
@AllArgsConstructor
public class AvisController {

    private final AvisService avisService;

    // Endpoint: POST /api/avis
    @PostMapping
    public ResponseEntity<Avis> addAvis(@RequestBody Avis avis) {
        // La logique dans le service s'assure qu'il est non approuvé (approuve = false)
        Avis savedAvis = avisService.saveAvis(avis);
        return new ResponseEntity<>(savedAvis, HttpStatus.CREATED);
    }

    // Endpoint: GET /api/avis
    @GetMapping
    public ResponseEntity<List<Avis>> getAllApprovedAvis() {
        // Renvoie uniquement les avis approuvés pour l'affichage public
        List<Avis> approvedAvis = avisService.getAllApprovedAvis();
        return ResponseEntity.ok(approvedAvis); // HttpStatus.OK (200)
    }
}