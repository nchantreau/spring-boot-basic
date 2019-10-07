package fr.nchantreau.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.nchantreau.domain.User;
import fr.nchantreau.domain.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @RequestMapping(value = "/users/{login}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable String login) {
        return new ResponseEntity<>(new User(login, 35), HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers(Pageable pageable) throws URISyntaxException {
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    /*
     * @RequestMapping(value = "/users", method = RequestMethod.POST, produces =
     * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<?>
     * createUser(@RequestBody UserDTO userDTO) throws URISyntaxException { //
     * code comes here }
     *
     * @RequestMapping(value = "/users", method = RequestMethod.PUT, produces =
     * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<?>
     * updateUser(@RequestBody UserDTO userDTO) { // code comes here }
     */
}
