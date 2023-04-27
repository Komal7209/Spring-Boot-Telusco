package com.telusko.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> // 1. to return a list rather than comma separated, we need to use JpaRepository
{

}
