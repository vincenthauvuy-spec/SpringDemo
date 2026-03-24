package com.vincent.demo.dao;

import com.vincent.demo.model.Role;
import com.vincent.demo.model.Aknowledge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AknowledgeDao extends JpaRepository<Role, Aknowledge.Key> {



}
