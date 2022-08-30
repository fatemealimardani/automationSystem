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
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_jobrecordinformation")
public class JobRecordInformation extends BaseEntity {
    @OneToOne
    @Column(name = "c_person")
    private Person person;
    @Column(name = "c_jobtitle")
    private String jobTitle;
    @Column(name = "c_jobposition")
    private String jobPosition;
    @Column(name = "c_jobpersonalcode")
    private String jobPersonalCode;
    @Column(name = "c_jobcomany")
    private String jobCompany;
    @Column(name = "c_jobdate")
    private Date jobDate;

    @Builder
    public JobRecordInformation(Person person, String jobTitle, String jobPosition, String jobPersonalCode, String jobCompany, Date jobDate) {
        this.person = person;
        this.jobTitle = jobTitle;
        this.jobPosition = jobPosition;
        this.jobPersonalCode = jobPersonalCode;
        this.jobCompany = jobCompany;
        this.jobDate = jobDate;
    }
}
