package fr.nchantreau.domain;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long> {
    List<User> findByEmailAddressAndLastname(String emailAddress, String lastname);

    List<User> findByAgeOrderByLastnameDesc(int age);

    List<User> findByAddressZipcode(String zipcode);
}