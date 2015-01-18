package com.objectpartners.wackyraces.registration.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    private RobotRepository robotRepository;

    public String registerRobot(Robot robot) {
        return robotRepository.save(robot).getRobotId();
    }
}
