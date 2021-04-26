package com.flyhub.ideamanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideamanagementsystem.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
