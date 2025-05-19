package com.xiomara.contactbookbackend.repositories;

import com.xiomara.contactbookbackend.entities.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

  
}
