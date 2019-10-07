package fr.test;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import fr.nchantreau.DemoSpringBootApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoSpringBootApplication.class)
@AutoConfigureMockMvc
public class UserTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void should_returns_hello_param_with_param() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/users/toto")
                                          .accept(MediaType.APPLICATION_JSON))
           .andExpect(status().isOk())
           .andExpect(jsonPath("$.name", is("toto")));
    }

}