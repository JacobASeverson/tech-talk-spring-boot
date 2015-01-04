package com.objectpartners.wackyraces.registration.robot.web;

import com.objectpartners.wackyraces.registration.robot.Robot;
import com.objectpartners.wackyraces.registration.robot.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @Autowired
    RobotService robotService;

    @RequestMapping(value = "/register/robot", method = RequestMethod.POST)
    public RegistrationResponse registerRobot(@RequestBody RegistrationRequest request) {
        //TODO: build robot from request
        return new RegistrationResponse(robotService.registerRobot(new Robot()));
    }

}
