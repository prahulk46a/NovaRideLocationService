package org.novaride.novaridelocationservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverLocationDto {
    String driverId;
    Double longitude;
    Double latitude;
}
