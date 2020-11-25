package com.lxy.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private Integer count1 = 1;

	@Scheduled(fixedRate = 60000)
	public String scheduledTaskImmediately() {

		return String.format("进入系统已经%s分钟当前日期为：%s", count1++, dateFormat.format(new Date()));
	}
}
