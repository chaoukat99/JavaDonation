package chaoukat_omar_controle.chaoukat_don_app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Donation {

    public Donation(){};
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Campagne campagne;

    @NotBlank
    private String nomDonateur;

    @NotNull
    @DecimalMin("0.1")
    private BigDecimal montant;

    private LocalDate date = LocalDate.now();

    public Donation(Long id, Campagne campagne, String nomDonateur, BigDecimal montant, LocalDate date) {
        this.id = id;
        this.campagne = campagne;
        this.nomDonateur = nomDonateur;
        this.montant = montant;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Campagne getCampagne() {
        return campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    public @NotBlank String getNomDonateur() {
        return nomDonateur;
    }

    public void setNomDonateur(@NotBlank String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public @NotNull @DecimalMin("0.1") BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(@NotNull @DecimalMin("0.1") BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
