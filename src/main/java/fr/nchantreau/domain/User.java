package fr.nchantreau.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
    private String emailAddress;
    @OneToOne
    private Address address;

    public User(String name, Integer age) {
	super();
	this.name = name;
	this.age = age;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getEmailAddress() {
	return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

}
