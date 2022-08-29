package com.zohocrm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
