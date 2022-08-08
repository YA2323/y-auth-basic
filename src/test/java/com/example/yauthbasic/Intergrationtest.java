package com.example.yauthbasic;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Intergrationtest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void expectUnauthorized() throws Exception {
        mockMvc.perform(get("/api/hello")
                ).andExpect(
                        status().isUnauthorized()
        );
    }


    @Test
    @WithMockUser(username = "xy", roles = "over18")
    void expectAuthorizedUser() throws Exception {
        mockMvc.perform(get("/api/hello")
        ).andExpect(
                status().isOk()
        );
    }

}
