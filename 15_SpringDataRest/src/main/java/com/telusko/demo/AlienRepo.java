package com.telusko.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.telusko.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel="aliens",path="aliens") // base url and path // this annotation replaces usage of controller
public interface AlienRepo extends JpaRepository<Alien,Integer>
{

}
