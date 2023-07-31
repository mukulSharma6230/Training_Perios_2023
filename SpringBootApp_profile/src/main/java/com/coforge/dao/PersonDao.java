package com.coforge.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.entity.person;

@Repository
public interface PersonDao extends JpaRepository<person,Integer> {

}
