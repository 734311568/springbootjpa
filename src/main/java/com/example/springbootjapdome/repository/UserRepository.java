/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjapdome.repository;

import com.example.springbootjapdome.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author 73431 CRUD
 */
public interface UserRepository extends CrudRepository<User, Long> {
	@Query("select u from User u")
	List<User>  findList();
}
