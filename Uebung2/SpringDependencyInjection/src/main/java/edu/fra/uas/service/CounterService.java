package edu.fra.uas.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int counter = 0;

    public int count() {
        counter++;
        return counter;
    }

}
