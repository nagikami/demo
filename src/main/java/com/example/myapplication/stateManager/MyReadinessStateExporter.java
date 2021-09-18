package com.example.myapplication.stateManager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyReadinessStateExporter {
    //Managing the Application Availability State
    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                log.info("accepting_traffic");
                break;
            case REFUSING_TRAFFIC:
                log.warn("refusing_traffic");
                break;
        }
    }
}
