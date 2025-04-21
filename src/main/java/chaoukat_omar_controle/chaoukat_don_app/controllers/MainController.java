package chaoukat_omar_controle.chaoukat_don_app.controllers;

import chaoukat_omar_controle.chaoukat_don_app.dto.DonDTO;
import chaoukat_omar_controle.chaoukat_don_app.models.Campagne;
import chaoukat_omar_controle.chaoukat_don_app.projection.CampagneResume;
import chaoukat_omar_controle.chaoukat_don_app.services.CampagneService;
import chaoukat_omar_controle.chaoukat_don_app.services.DonService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    private CampagneService campagneService;
    private DonService DonService;

    public MainController(CampagneService campService, DonService DonServ) {
        campagneService = campService;
        DonService =DonServ ;
    }

    @GetMapping("/campagnes/actives")
    public List<CampagneResume> getCampagnesActives() {
        return campagneService.getCampagnesActives();
    }


    @PostMapping("/campagnes")
    public ResponseEntity<Campagne> creerCampagne(@Valid @RequestBody Campagne campagne) {
        Campagne saved = campagneService.saveCompagne(campagne);
        return ResponseEntity.ok(saved);
    }

    @PostMapping("/campagnes/{id}/dons")
    public ResponseEntity<DonDTO> saveDon(@PathVariable Long id, @Valid @RequestBody DonDTO donDTO) {
        DonDTO savedDon = DonService.saveDon(id,donDTO);
        return ResponseEntity.ok(savedDon);
    }


}
