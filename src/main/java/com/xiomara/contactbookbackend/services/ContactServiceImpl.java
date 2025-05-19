package com.xiomara.contactbookbackend.services;

import com.xiomara.contactbookbackend.entities.Contact;
import com.xiomara.contactbookbackend.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

  @Autowired
  private ContactRepository contactRepository;

  @Override
  public List<Contact> findAll() {
    List<Contact> contactList = (List<Contact>) this.contactRepository.findAll();

    return contactList;
  }

  @Override
  public Contact createNew(Contact contact) {
    Contact newContact = this.contactRepository.save(contact);

    return newContact;
  }

  @Override
  public void delete(int id) {
    this.contactRepository.deleteById(id);
  }
}
