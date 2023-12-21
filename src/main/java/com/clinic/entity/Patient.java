package com.clinic.entity;

import java.util.Date;

import com.clinic.entity.Enum.GenderType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private GenderType sexe;
    private String adresse;
    private String situationFamilliale;
    private String assuranceMedicale;
    private String tel;
    private String email;
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dossier_medical_id", referencedColumnName = "id")
    private DossierMedical dossierMedical;*/
}

