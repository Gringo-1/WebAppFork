package edu.fra.uas.v3autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Journeyman2 {
    @Autowired
    @Qualifier("pleaseDrill")
    Work work;
    
    public void performWork2() {
        work.doWork();
   }

}
