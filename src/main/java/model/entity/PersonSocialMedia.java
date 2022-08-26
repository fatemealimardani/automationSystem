package model.entity;

import model.entity.base.BaseEntity;
import model.entity.enumrations.SocialMediaType;

public class PersonSocialMedia extends BaseEntity {
    private Person person;
    private SocialMediaType type;
    private String mediaAddress;
}
