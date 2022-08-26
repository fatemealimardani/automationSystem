package model.entity;

import model.entity.base.BaseEntity;

import java.time.LocalDate;

public class PersonSkill extends BaseEntity {
    private Person person;
    private String title;
    private LocalDate certificateDate;
    private String institute;
    private String level;
}
