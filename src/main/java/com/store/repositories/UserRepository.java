package com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
