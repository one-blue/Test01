package com.lxy.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lxy.domain.Index;

//查询主页面的图片，名称，和大图片
public interface IndexRepository extends JpaRepository<Index, Integer>{

}
