package com.objectpartners.wackyraces.registration.robot.web;

public class RegistrationResponse {

    private String robotId;

    public RegistrationResponse(String robotId) {
        this.robotId = robotId;
    }

    public String getRobotId() { return robotId; }

}
