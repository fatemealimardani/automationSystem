package model.entity;

import model.entity.base.BaseEntity;
import model.entity.enumrations.GenderType;

import java.time.LocalDate;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String fatherName;
    private GenderType gender;
    private LocalDate birthDate;
    private String identitySerialNumber;
    private boolean militaryServiceStatus;
    private int attachmentId;
    private String personSecurity;
}
