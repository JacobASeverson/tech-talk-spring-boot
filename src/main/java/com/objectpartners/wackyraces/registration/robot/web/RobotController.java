package com.objectpartners.wackyraces.registration.robot.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @RequestMapping(value = "/register/robot", method = RequestMethod.POST)
    public RegistrationResponse registerRobot(@RequestBody RegistrationRequest request) {
        return new RegistrationResponse("testrobotid");
    }

}
