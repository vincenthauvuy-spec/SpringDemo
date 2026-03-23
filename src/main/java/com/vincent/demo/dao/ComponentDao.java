package com.vincent.demo.dao;

import com.vincent.demo.model.Component;
import com.vincent.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentDao extends JpaRepository<Component, Integer> {



}
