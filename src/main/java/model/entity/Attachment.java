package model.entity;

import model.entity.base.BaseEntity;
import model.entity.enumrations.AttachmentType;
import model.entity.enumrations.FileType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_attachment")
public class Attachment extends BaseEntity {
    @Column(name = "c_path")
    private String path;
    @Column(name = "c_type")
    private AttachmentType attachmentType;
    @Column(name = "c_filetype")
    private FileType fileType;
}
