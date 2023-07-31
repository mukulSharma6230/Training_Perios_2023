package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.Excpetion.PersonException;
import com.coforge.dao.PersonDao;
import com.coforge.entity.person;
@Service
public class personService {

	
	@Autowired
	PersonDao dao;
	
	public person addperson(person p) throws PersonException {
		if(dao.getReferenceById(p.getId())!=null)
			throw new PersonException("person already present");
		else
			return dao.save(p);
	}
   public List<person> gtAllPerson(person p) throws PersonException{
	   if(dao.findAll().size()==0)
		   throw new PersonException("person list is empty");
	   else
		   return dao.findAll();
   }


}
