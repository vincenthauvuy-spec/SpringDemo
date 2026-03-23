package com.vincent.demo.dao;

import com.vincent.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserDao extends JpaRepository<AppUser, Integer> {



}
