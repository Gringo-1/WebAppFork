package edu.fra.uas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {
	@Autowired
	private CounterService counterService;

	public int useCount() {
		return counterService.count();
	}
	
}
