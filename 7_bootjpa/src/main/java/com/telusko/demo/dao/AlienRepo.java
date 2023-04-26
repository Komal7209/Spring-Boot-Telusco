// 9. Following is interface, which got created after new>interface

package com.telusko.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

//9.1 Here, we will extend to CrudRepository 
public interface AlienRepo extends CrudRepository<Alien,Integer> // class name, type of primary key
{

}

// 9.2 wherever , i want to use it i want write AlienRepo repo with @Autowired annotation