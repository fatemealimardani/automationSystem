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
@Table(name = "t_addressinformation")
public class AddressInformation extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_address")
    private String address;
    @Column(name = "c_phone")
    private String phone;
    @Column(name = "c_postalcodehome")
    private String postalCodeHome;

    @Builder
    public AddressInformation(Person person, String address, String phone, String postalCodeHome) {
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.postalCodeHome = postalCodeHome;
    }
}
