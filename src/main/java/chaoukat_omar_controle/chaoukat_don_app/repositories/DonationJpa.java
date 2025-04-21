package chaoukat_omar_controle.chaoukat_don_app.repositories;

import chaoukat_omar_controle.chaoukat_don_app.models.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationJpa extends JpaRepository<Donation,Long> {
}
