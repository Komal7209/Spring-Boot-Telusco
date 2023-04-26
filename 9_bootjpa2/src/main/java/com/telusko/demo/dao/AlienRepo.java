package com.telusko.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{
List<Alien> findByTech(String tech); // because of spring jpa this declaration will get the implementation
                                     // method should start by {findBy} and end by the name of property, then only declaration will get the implementation

List<Alien> findByAidGreaterThan(int aid); // findBy<Property name><then what want to do>

@Query("from Alien where tech=?1 order by aname")  // this is jp ql query // we also use numbers as there might be multiple question marks
List<Alien>findByTechSorted(String tech); // Sorted keyword only works with JP ql query , which we have written above

}
