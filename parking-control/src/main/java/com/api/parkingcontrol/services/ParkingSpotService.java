package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.IParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;

@Service
public class ParkingSpotService {

    final IParkingSpotRepository iParkingSpotRepository;

    public ParkingSpotService(IParkingSpotRepository iParkingSpotRepository){
        this.iParkingSpotRepository = iParkingSpotRepository;
    }

    @Transient
    public ParkingSpotModel save(ParkingSpotModel parrkingSpotModel) {
        return iParkingSpotRepository.save(parrkingSpotModel);
    }
}
