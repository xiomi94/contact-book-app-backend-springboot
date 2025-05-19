package com.xiomara.contactbookbackend.services;

import com.xiomara.contactbookbackend.entities.Contact;

import java.util.List;

public interface ContactService {

  List<Contact> findAll();

  Contact createNew(Contact contact);

  void delete(int id);
}
