// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.credera.roocontactssample.domain;

import com.credera.roocontactssample.domain.Contact;

privileged aspect Contact_Roo_JavaBean {
    
    public String Contact.getName() {
        return this.name;
    }
    
    public void Contact.setName(String name) {
        this.name = name;
    }
    
    public String Contact.getAddress() {
        return this.address;
    }
    
    public void Contact.setAddress(String address) {
        this.address = address;
    }
    
    public String Contact.getPhone() {
        return this.phone;
    }
    
    public void Contact.setPhone(String phone) {
        this.phone = phone;
    }
    
}
