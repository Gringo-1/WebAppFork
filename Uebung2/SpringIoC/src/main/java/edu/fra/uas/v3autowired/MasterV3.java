package edu.fra.uas.v3autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MasterV3 {
    @Autowired
    Journeyman journeyman;
    @Autowired
    Journeyman2 journeyman2;
    @Autowired
    Journeyman3 journeyman3;

    public void delegateWork() {
        journeyman.performWork();
        journeyman2.performWork2();
        journeyman3.performWork3();
    }
}
