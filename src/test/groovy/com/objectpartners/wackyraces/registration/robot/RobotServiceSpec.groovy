package com.objectpartners.wackyraces.registration.robot

import spock.lang.Specification

class RobotServiceSpec extends Specification {

    RobotService robotService = new RobotService()

    void "test a valid robot gets registered"() {
        given:
        Robot robot = new Robot()

        when:
        String robotId = robotService.registerRobot(robot)

        then:
        robotId == "testRobotId"
    }
}