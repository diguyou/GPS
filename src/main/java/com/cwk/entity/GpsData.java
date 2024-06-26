package com.cwk.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GpsData implements Serializable {
    private Long id;

    private Long tripId;

    private double latitude;

    private double longitude;

    private LocalDateTime timestamp;
}
