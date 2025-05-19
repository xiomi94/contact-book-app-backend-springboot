package com.xiomara.contactbookbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String lastname;

  @Column(name = "telephone_number")
  private String telephoneNumber;

  private String email;

  public Contact() {
  }

  public Contact(String email, String telephoneNumber, String lastname, String name) {
    this.email = email;
    this.telephoneNumber = telephoneNumber;
    this.lastname = lastname;
    this.name = name;
  }

  public Contact(int id, String name, String lastname, String telephoneNumber, String email) {
    this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.telephoneNumber = telephoneNumber;
    this.email = email;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return this.lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getTelephoneNumber() {
    return this.telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Contact{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", lastname='" + lastname + '\'' +
            ", telephoneNumber='" + telephoneNumber + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
