package chaoukat_omar_controle.chaoukat_don_app.services;

import chaoukat_omar_controle.chaoukat_don_app.dto.DonDTO;
import chaoukat_omar_controle.chaoukat_don_app.models.Campagne;
import chaoukat_omar_controle.chaoukat_don_app.models.Donation;
import chaoukat_omar_controle.chaoukat_don_app.repositories.CampagneJpa;
import chaoukat_omar_controle.chaoukat_don_app.repositories.DonationJpa;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DonService {

    private final CampagneJpa compagneRepo;
    private final DonationJpa donationRepo;


    public DonService(CampagneJpa compRepo,DonationJpa donRepo){
        compagneRepo=compRepo;
        donationRepo=donRepo;
    }

    public DonDTO saveDon(Long campagneId, DonDTO dto){
        Campagne campagne=compagneRepo.findById(campagneId)
                .orElseThrow(()->new RuntimeException("Campagne introuvable"));
        Donation don=new Donation();
        don.setCampagne(campagne);
        don.setNomDonateur(dto.getNomDonateur());
        don.setMontant(dto.getMontant());
        don.setDate(LocalDate.now());
        Donation saved=donationRepo.save(don);
        dto.setId(saved.getId());
        dto.setDate(saved.getDate());
        dto.setNomCampagne(saved.getCampagne().getNom());
        return dto;
    }




}
