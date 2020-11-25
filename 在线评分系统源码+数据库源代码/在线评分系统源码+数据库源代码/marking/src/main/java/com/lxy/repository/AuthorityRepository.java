package com.lxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.Authority;

import java.util.List;

/**
 * Created by admin on 2018-11-19.
 */
public interface AuthorityRepository extends JpaRepository<Authority,Integer> {
    @Query(value = "select a.* from t_user c,t_authority a,t_authority_user ca where ca.user_id=c.id and ca.authority_id=a.id and c.user_name =?1",nativeQuery = true)
    public List<Authority> findAuthoritiesByUsername(String name);

}
