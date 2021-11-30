package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Event {

    private String eventName;
    private String description;
    private LocalDate dateCreated;

    public Event(String _eventName, String _description){
        eventName = _eventName;
        description = _description;
        dateCreated = java.time.LocalDate.now();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
