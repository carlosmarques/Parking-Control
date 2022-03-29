package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.IParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    final IParkingSpotRepository iParkingSpotRepository;

    public ParkingSpotService(IParkingSpotRepository iParkingSpotRepository){
        this.iParkingSpotRepository = iParkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return iParkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar (String licensePlateCar){
        return iParkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByLicenseParkingSpotNumber (String parkingSpotNumber){
        return iParkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock (String apartment, String block){
        return iParkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

}
