package com.flyhub.ideamanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideamanagementsystem.entity.Idea;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long>{
}
