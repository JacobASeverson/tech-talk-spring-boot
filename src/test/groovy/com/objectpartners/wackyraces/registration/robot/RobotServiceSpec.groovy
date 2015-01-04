package com.objectpartners.wackyraces.registration.robot

import spock.lang.Specification

class RobotServiceSpec extends Specification {

    RobotService robotService = new RobotService()
    RobotRepository mockRobotRepository = Mock(RobotRepository)

    void setup() {
        robotService.robotRepository = mockRobotRepository
    }

    void "test a valid robot gets registered"() {
        given:
        Robot robot = new Robot()

        when:
        String robotId = robotService.registerRobot(robot)

        then:
        robotId == 'testRobotId'
        1 * mockRobotRepository.save(_) >> { return new Robot(robotId: 'testRobotId') }
    }
}