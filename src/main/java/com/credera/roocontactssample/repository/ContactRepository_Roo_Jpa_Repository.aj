// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.credera.roocontactssample.repository;

import com.credera.roocontactssample.domain.Contact;
import com.credera.roocontactssample.repository.ContactRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect ContactRepository_Roo_Jpa_Repository {
    
    declare parents: ContactRepository extends JpaRepository<Contact, Long>;
    
    declare parents: ContactRepository extends JpaSpecificationExecutor<Contact>;
    
    declare @type: ContactRepository: @Repository;
    
}
