package com.xiomara.contactbookbackend.controllers;

import com.xiomara.contactbookbackend.entities.Contact;
import com.xiomara.contactbookbackend.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

  @Autowired
  private ContactService contactService;

  @GetMapping
  public List<Contact> contactList() {
    return this.contactService.findAll();
  }

  @PostMapping
  public Contact addNew(
          @RequestBody Contact newContact
  ) {
    Contact contactInDatabase = this.contactService.createNew(newContact);
    return contactInDatabase;
  }

  @DeleteMapping("/{id}")
  public Map<String, String> deleteById(
          @PathVariable Integer id
  ) {
    this.contactService.delete(id);
    Map<String, String> response = new HashMap<>();
    response.put("status", "ok");
    return response;
  }


}
