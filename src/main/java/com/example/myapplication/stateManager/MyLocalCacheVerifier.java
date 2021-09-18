package com.example.myapplication.stateManager;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyLocalCacheVerifier {
    private final ApplicationEventPublisher eventPublisher;

    public MyLocalCacheVerifier(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void checkLocalCache() {
        try {
            throw new RuntimeException("cache is broken");
        } catch (RuntimeException ex) {
            AvailabilityChangeEvent.publish(eventPublisher, ex, LivenessState.BROKEN);
        }
    }
}
