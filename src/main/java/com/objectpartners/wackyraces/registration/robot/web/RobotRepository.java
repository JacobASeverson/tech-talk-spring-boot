package com.objectpartners.wackyraces.registration.robot.web;

import com.objectpartners.wackyraces.registration.robot.Robot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "robots", path = "robots")
public interface RobotRepository extends MongoRepository<Robot, String> {
    List<Robot> findByName(@Param("name") String name);
}
