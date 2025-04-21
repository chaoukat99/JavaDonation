package chaoukat_omar_controle.chaoukat_don_app.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DonDTO {
    private Long id;
    @NotBlank
    private String nomCampagne;

    @NotBlank
    private String nomDonateur;

    @NotNull
    @DecimalMin("0.1")
    private BigDecimal montant;

    private LocalDate date;

public DonDTO(){};
    public DonDTO(Long id, String nomCampagne, String nomDonateur, BigDecimal montant, LocalDate date) {
        this.id = id;
        this.nomCampagne = nomCampagne;
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

    public @NotBlank String getNomCampagne() {
        return nomCampagne;
    }

    public void setNomCampagne(@NotBlank String nomCampagne) {
        this.nomCampagne = nomCampagne;
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
