package com.objectpartners.wackyraces.registration.robot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RobotRepository extends MongoRepository<Robot, String> {}
