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
@Table(name = "t_personsponsoredstatus")
public class PersonSponsoredStatus extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_firstname")
    private String firstName;
    @Column(name = "c_lastname")
    private String lastName;
    @Column(name = "c_nationalcode")
    private String nationalCode;
    @Column(name = "c_relation")
    private String relation;

    @Builder
    public PersonSponsoredStatus(Person person, String firstName, String lastName, String nationalCode, String relation) {
        this.person = person;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.relation = relation;
    }
}
