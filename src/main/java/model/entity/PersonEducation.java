package model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.entity.base.BaseEntity;
import model.entity.enumrations.EducationLevelType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_personeducation")
public class PersonEducation extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_level")
    private EducationLevelType level;
    @Column(name = "c_feild")
    private String field;
    @Column(name = "c_grade")
    private float grade;
    @Column(name = "c_university")
    private String university;
    @Column(name = "c_graduationdate")
    private LocalDate graduationDate;

    @Builder
    public PersonEducation(Person person, EducationLevelType level, String field, float grade, String university, LocalDate graduationDate) {
        this.person = person;
        this.level = level;
        this.field = field;
        this.grade = grade;
        this.university = university;
        this.graduationDate = graduationDate;
    }
}
