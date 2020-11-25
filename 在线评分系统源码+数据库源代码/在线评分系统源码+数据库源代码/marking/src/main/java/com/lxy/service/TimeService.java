package com.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxy.domain.Time;
import com.lxy.repository.TimeRepository;

@Service
public class TimeService {

	@Autowired
	private TimeRepository timerepository;

	public int updateTime(String name, int id) {
		return timerepository.updateTime(name, id);

	}

	public List<Time> findAll() {
		// TODO Auto-generated method stub
		return timerepository.findAll();
	}

	public void deleteById(int idt) {

		// TODO Auto-generated method stub

		timerepository.deleteById(idt);
	}

	public Time save(Time t) {
		return timerepository.save(t);
		// TODO Auto-generated method stub

	}

}
