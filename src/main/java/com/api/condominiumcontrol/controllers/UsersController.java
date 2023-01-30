package com.api.condominiumcontrol.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.condominiumcontrol.dtos.UsersDto;
import com.api.condominiumcontrol.exception.ValidObjectException;
import com.api.condominiumcontrol.models.UsersModel;
import com.api.condominiumcontrol.services.UsersService;
import com.api.condominiumcontrol.services.exception.RegisterExistException;

@RestController
/* Permite ser acessada de qualquer lugar */
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	/* O @valid aciona as validacoes no DTO
	 * */
	@PostMapping
	public ResponseEntity<Object> saveUser(@RequestBody @Valid UsersDto usersDto) {
		var usersModel = new UsersModel();
		/*
		 * BeanUtils.copyProperties = Converte o userDto em userModel */
		BeanUtils.copyProperties(usersDto, usersModel);
		
		boolean registerDuplicated;
		registerDuplicated = usersService.existUser(usersDto.getDocUser());
		
		if (registerDuplicated == true) {
			//return (ResponseEntity<Object>) ResponseEntity.status(HttpStatus.CONFLICT);
			throw new RegisterExistException("Cadastro ja existe");
		} 
		return ResponseEntity.status(HttpStatus.CREATED).body(usersService.save(usersModel));
	}
	
}
