package model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_militaryserviceinformation")
public class MilitaryServiceInformation extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_militaryexamption")
    private String militaryExamption;
    @Column(name = "c_medicaleexamption")
    private String medicalExemption;
    @Column(name = "c_militaryservicedate")
    private Date militaryServiceDate;

    @Builder
    public MilitaryServiceInformation(Person person, String militaryExamption, String medicalExemption, Date militaryServiceDate) {
        this.person = person;
        this.militaryExamption = militaryExamption;
        this.medicalExemption = medicalExemption;
        this.militaryServiceDate = militaryServiceDate;
    }
}
