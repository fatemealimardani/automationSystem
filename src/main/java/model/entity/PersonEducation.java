package model.entity;

import model.entity.base.BaseEntity;
import model.entity.enumrations.EducationLevelType;

import java.time.LocalDate;

public class PersonEducation extends BaseEntity {
    private Person person;
    private EducationLevelType level;
    private String field;
    private float grade;
    private String university;
    private LocalDate graduationDate;
}
