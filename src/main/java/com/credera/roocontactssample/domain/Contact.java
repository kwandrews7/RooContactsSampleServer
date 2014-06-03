package com.credera.roocontactssample.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson(deepSerialize = true)
public class Contact {

    /**
     */
    @NotNull
    @Column(name = "name")
    @Size(min = 1, max = 75)
    private String name;

    /**
     */
    @Column(name = "address")
    @Size(max = 160)
    private String address;

    /**
     */
    @Column(name = "phone")
    @Size(min = 10, max = 20)
    private String phone;
}
