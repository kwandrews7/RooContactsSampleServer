package com.credera.roocontactssample.repository;
import com.credera.roocontactssample.domain.Contact;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Contact.class)
public interface ContactRepository {
}
