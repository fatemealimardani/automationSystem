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
@Table(name = "t_physicalconditioninformation")
public class PhysicalConditionInformation extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_height")
    private double height;
    @Column(name = "c_weight")
    private double weight;
    @Column(name = "c_bloodtype")
    private String bloodType;
    @Column(name = "c_physicalcondition")
    private boolean physicalCondition;
    @Column(name = "c_insurance")
    private long Insurance;
    @Column(name = "c-disability")
    private String disability;

    @Builder
    public PhysicalConditionInformation(Person person, double height, double weight, String bloodType, boolean physicalCondition, long insurance, String disability) {
        this.person = person;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.physicalCondition = physicalCondition;
        Insurance = insurance;
        this.disability = disability;
    }
}
