package com.example.myapplication.stateManager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyLivenessStateExporter {
    //Managing the Application Availability State
    @EventListener
    public void onStateChange(AvailabilityChangeEvent<LivenessState> event) {
        switch (event.getState()) {
            case CORRECT:
                log.info("application is correct");
                break;
            case BROKEN:
                log.warn("application is broken");
                break;
        }
    }
}
