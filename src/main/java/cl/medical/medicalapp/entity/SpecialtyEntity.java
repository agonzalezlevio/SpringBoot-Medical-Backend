package cl.medical.medicalapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "specialty")
public class SpecialtyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idSpecialty;

    @Column(nullable = false, length = 72)
    private String name;

    public Integer getIdSpecialty() {
        return idSpecialty;
    }

    public void setIdSpecialty(Integer idSpecialty) {
        this.idSpecialty = idSpecialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
