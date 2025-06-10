package com.xiomara.contactbookbackend.repositories;

import com.xiomara.contactbookbackend.entities.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

  @Query("SELECT c FROM Contact c WHERE c.name LIKE CONCAT('%', :stringParaBuscar, '%') OR c.lastname LIKE CONCAT('%', :stringParaBuscar, '%')")
  List<Contact> searchNameOrSurnameByString(String stringParaBuscar);

}
