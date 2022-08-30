package model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.entity.base.BaseEntity;
import model.entity.enumrations.SocialMediaType;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_personsocialmedia")
public class PersonSocialMedia extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_type")
    private SocialMediaType type;
    @Column(name = "c_mediaaddress")
    private String mediaAddress;
}
