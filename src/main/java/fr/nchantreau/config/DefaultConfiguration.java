package fr.nchantreau.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "my", ignoreUnknownFields = false)
public class DefaultConfiguration {
    
    private Config config;
    
    public Config getConfig() {
        return config;
    }
    public void setConfig(Config config) {
        this.config = config;
    }
    
    public static class Config {
        
        private Person person;
        
        public Person getPerson() {
            return person;
        }
        public void setPerson(Person person) {
            this.person = person;
        }
        
        public static class Person {
            private String name;
            private String lastname;
            private Address address;
            
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
            
            public Address getAddress() {
                return address;
            }
            public void setAddress(Address address) {
                this.address = address;
            }
            
            public static class Address {
                private String street;
                
                public String getStreet() {
                    return street;
                }
                public void setStreet(String street) {
                    this.street = street;
                }
            }
        }
    }
}
