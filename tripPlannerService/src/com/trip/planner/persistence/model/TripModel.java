package com.trip.planner.persistence.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "trip")
@XmlAccessorType(XmlAccessType.FIELD)
public class TripModel implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @XmlElement
    private Integer tripId;
    
    @XmlElement
    private String tripDescription;
    /**
    @XmlElement
    public void setTripId(Integer tripId) {
       this.tripId = tripId;
    }
    public Integer getTripId() {
       return tripId;
    }
    
    @XmlElement
    public void setTripDescription(String tripDescription) {
       this.tripDescription = tripDescription;
    }
    public String getTripDescription() {
       return tripDescription;
    }
    **/
    public TripModel() {
        this.tripId = 5;
        this.tripDescription = "This is a test trip";
    }
}
