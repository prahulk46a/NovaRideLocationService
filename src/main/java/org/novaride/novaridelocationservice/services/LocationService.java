package org.novaride.novaridelocationservice.services;

import org.novaride.novaridelocationservice.dto.DriverLocationDto;

import java.util.List;

public interface LocationService {

    Boolean saveDriverLocation(String driverId, Double latitude, Double Longitude);
    List<DriverLocationDto> getNearByDrivers(Double latitude, Double Longitude);

}
