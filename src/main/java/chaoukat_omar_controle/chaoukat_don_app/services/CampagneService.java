package chaoukat_omar_controle.chaoukat_don_app.services;

import chaoukat_omar_controle.chaoukat_don_app.models.Campagne;
import chaoukat_omar_controle.chaoukat_don_app.projection.CampagneResume;
import chaoukat_omar_controle.chaoukat_don_app.repositories.CampagneJpa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampagneService {
    private final CampagneJpa compagneRepo;
    public Campagne saveCompagne(Campagne camp){
        return compagneRepo.save(camp);    }
    public CampagneService(CampagneJpa compRepo){
        compagneRepo=compRepo;

    }

    public List<CampagneResume> getCampagnesActives(){
        return compagneRepo.findCompagnesActives();
    }
}
