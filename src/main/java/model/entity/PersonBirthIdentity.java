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

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_personBirthIdentity")
public class PersonBirthIdentity extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_description")
    private String description;
    @Column(name = "c_location")
    private String location;
    @Column(name = "c_identityserialnumber")
    private String identitySerialNumber;

    @Builder
    public PersonBirthIdentity(Person person, String description, String location, String identitySerialNumber) {
        this.person = person;
        this.description = description;
        this.location = location;
        this.identitySerialNumber = identitySerialNumber;
    }
}
