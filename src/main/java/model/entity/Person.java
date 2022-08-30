package model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.entity.base.BaseEntity;
import model.entity.enumrations.GenderType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_person")
public class Person extends BaseEntity {
    @Column(name = "c_firstname")
    private String firstName;
    @Column(name = "c_lastname")
    private String lastName;
    @Column(name = "nationalcode")
    private String nationalCode;
    @Column(name = "c_fathername")
    private String fatherName;
    @Column(name = "c_gender")
    private GenderType gender;
    @Column(name = "C_birthdate")
    private LocalDate birthDate;
    @Column(name = "c_identityserialnumber")
    private String identitySerialNumber;
    @Column(name = "c_militaryServiceStatus")
    private boolean militaryServiceStatus;
    @OneToMany(fetch = FetchType.LAZY)
    @Column(name = "c_attachment")
    private List<Attachment> attachment;
    @Column(name = "c_personsecurity")
    private String personSecurity;

    @Builder
    public Person(String firstName, String lastName, String nationalCode, String fatherName, GenderType gender, LocalDate birthDate, String identitySerialNumber, boolean militaryServiceStatus, List<Attachment> attachment, String personSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.fatherName = fatherName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.identitySerialNumber = identitySerialNumber;
        this.militaryServiceStatus = militaryServiceStatus;
        this.attachment = attachment;
        this.personSecurity = personSecurity;
    }
}
