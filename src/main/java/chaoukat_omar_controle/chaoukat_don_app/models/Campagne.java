package chaoukat_omar_controle.chaoukat_don_app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Campagne {

    public Campagne() {
    }


    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id ;

    @NotBlank
    private String nom;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal objectifMontant;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Campagne(Long id, String nom, BigDecimal objectifMontant, LocalDate dateDebut, LocalDate dateFin) {
        this.id = id;
        this.nom = nom;
        this.objectifMontant = objectifMontant;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(@NotBlank String nom) {
        this.nom = nom;
    }

    public @NotNull @DecimalMin("0.0") BigDecimal getObjectifMontant() {
        return objectifMontant;
    }

    public void setObjectifMontant(@NotNull @DecimalMin("0.0") BigDecimal objectifMontant) {
        this.objectifMontant = objectifMontant;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}


