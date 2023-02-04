package com.api.condominiumcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Repository;

import com.api.condominiumcontrol.models.UsersModel;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, UUID>{
	
	@Query("Select users.id from UsersModel users where users.docUser = ?1 ")
	String findByDocReturnId(String doc);

}
