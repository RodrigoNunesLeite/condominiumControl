package com.api.condominiumcontrol.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.condominiumcontrol.models.UsersModel;
import com.api.condominiumcontrol.repositories.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	UsersRepository usersRepository;
	
	/*Transactional = Se der algum erro, garante o rollback
	 * */
	@Transactional
	public UsersModel save(UsersModel usersModel) {
		return usersRepository.save(usersModel);
	}
	
	 public Boolean existUser(String doc) {
		 String id = usersRepository.findByDocReturnId(doc);
		 
		 return id != "" ? true:false;
	 } 
}
