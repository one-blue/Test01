package com.lxy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.lxy.domain.Score;
import com.lxy.repository.ScoreRepository;

@Service
public class ScoreService {
@Autowired
private ScoreRepository scorerepository;
//查询用户信息

public List<Score> findAll() {
	return scorerepository.findAll();
}


public void deleteById(int id) {
	// TODO Auto-generated method stub
	 scorerepository.deleteById(id);
	
	
}
public int updatescore(String name, int id2) {
	return scorerepository.updatescore(name,id2);
	// TODO Auto-generated method stub
	
}

public Score save(Score s) {
	return scorerepository.save(s);
	// TODO Auto-generated method stub
	
}

public List<Score> findByName(String userName) {
	return scorerepository.findByName(userName);
	// TODO Auto-generated method stub
	
}





}
