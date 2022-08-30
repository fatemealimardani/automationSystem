package model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.entity.base.BaseEntity;
import model.entity.enumrations.SkillLevelType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_personskill")
public class PersonSkill extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_title")
    private String title;
    @Column(name = "c_certificatedate")
    private LocalDate certificateDate;
    @Column(name = "c_institute")
    private String institute;
    @Column(name = "c_level")
    private SkillLevelType level;

    @Builder
    public PersonSkill(Person person, String title, LocalDate certificateDate, String institute, SkillLevelType level) {
        this.person = person;
        this.title = title;
        this.certificateDate = certificateDate;
        this.institute = institute;
        this.level = level;
    }
}
