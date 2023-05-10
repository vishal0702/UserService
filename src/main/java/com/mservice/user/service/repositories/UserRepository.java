package com.mservice.user.service.repositories;


import com.mservice.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

}
