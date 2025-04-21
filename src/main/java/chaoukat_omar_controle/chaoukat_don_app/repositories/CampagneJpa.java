package chaoukat_omar_controle.chaoukat_don_app.repositories;

import chaoukat_omar_controle.chaoukat_don_app.models.Campagne;
import chaoukat_omar_controle.chaoukat_don_app.projection.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CampagneJpa extends JpaRepository<Campagne,Long> {
    @Query("SELECT c FROM Campagne c WHERE c.dateDebut <= CURRENT_DATE  AND c.dateFin >= CURRENT_DATE")
    List<CampagneResume> findCompagnesActives();
}
