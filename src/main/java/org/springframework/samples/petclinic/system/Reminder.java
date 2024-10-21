package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Reminder {

    @Value("#{@welcomeMessageProperties.getMessage() + ' : ' + T(org.springframework.boot.SpringBootVersion).getVersion()}")
    private String message;

    private String context;

    public void remind() {
        System.out.println("reminder: " + message + " - " + context);
    }
    
}
