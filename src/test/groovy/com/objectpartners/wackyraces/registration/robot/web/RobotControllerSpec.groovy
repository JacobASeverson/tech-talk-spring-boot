package com.objectpartners.wackyraces.registration.robot.web

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.web.servlet.MockMvc
import org.springframework.http.MediaType
import spock.lang.Specification

import static org.springframework.http.HttpStatus.BAD_REQUEST
import static org.springframework.http.HttpStatus.OK
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class RobotControllerSpec extends Specification {

    RobotController robotController = new RobotController()
    MockMvc mockMvc = standaloneSetup(robotController).build()

    void "test valid robot registration request registers robot and returns a robot id"() {
        given:
        RegistrationRequest request = new RegistrationRequest(name: 'testBot', address: '0.0.0.0')

        when:
        RegistrationResponse response = new Gson().fromJson(mockMvc.perform(post('/register/robot')
                .contentType(MediaType.APPLICATION_JSON)
                .content(toJson(request)))
                .andReturn()
                .response
                .getContentAsString(), RegistrationResponse.class)

        then:
        response.robotId == 'testrobotid'
    }

    private static String toJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper()
        return objectMapper.writeValueAsString(obj)
    }
}