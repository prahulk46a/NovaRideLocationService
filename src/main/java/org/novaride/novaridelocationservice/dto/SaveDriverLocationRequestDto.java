package org.novaride.novaridelocationservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveDriverLocationRequestDto {
    String driverId;
    Double latitude;
    Double longitude;
}
