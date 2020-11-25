package com.lxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.UserAuthority;

import java.util.List;

/**
 * Created by admin on 2018-11-19.
 */
public interface UserAuthorityRepository extends JpaRepository<UserAuthority,Integer> {
   

}
