package fr.nchantreau.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String zipcode;
    private String city;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getZipcode() {
	return zipcode;
    }

    public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }
}
