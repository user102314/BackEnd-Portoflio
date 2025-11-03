package BackEnd.Portfolio.service;

import BackEnd.Portfolio.model.Avis;
import java.util.List;

public interface AvisService {
    // Opération pour ajouter un nouvel avis (doit être non approuvé par défaut)
    Avis saveAvis(Avis avis);

    // Opération pour voir tous les avis approuvés (pour le frontend)
    List<Avis> getAllApprovedAvis();

    // Vous pourriez ajouter une méthode pour la gestion/modération, ex:
    // List<Avis> getAllAvisForAdmin();
    // Avis approveAvis(Long id);
}