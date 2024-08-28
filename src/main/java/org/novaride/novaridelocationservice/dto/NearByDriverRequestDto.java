package org.novaride.novaridelocationservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NearByDriverRequestDto {
    Double latitude;
    Double longitude;
}
