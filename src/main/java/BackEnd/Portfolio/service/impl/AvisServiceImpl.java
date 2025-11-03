package BackEnd.Portfolio.service.impl;

import BackEnd.Portfolio.model.Avis;
import BackEnd.Portfolio.repository.AvisRepository;
import BackEnd.Portfolio.service.AvisService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class AvisServiceImpl implements AvisService {

    private final AvisRepository avisRepository;

    @Override
    public Avis saveAvis(Avis avis) {
        // S'assurer que le champ 'approuve' est bien 'false' lors de l'ajout
        avis.setApprouve(false);
        return avisRepository.save(avis);
    }

    @Override
    public List<Avis> getAllApprovedAvis() {
        // Utilisation de la méthode personnalisée du Repository
        return avisRepository.findAllByApprouveTrue();
    }
}