package com.cg.FirstScbMicroservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.FirstScbMicroservices.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

