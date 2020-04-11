package com.management.gatepass.Entity;

import com.management.gatepass.Constants.GatepassTypeEnum;
import lombok.*;

import java.time.LocalDate;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor    //TODO optional to kept location is to used from constants.
@Setter @Getter
public class GatepassEntity {
    //TODO Data should be more normalised.
    private LocalDate date;
    private String location;
    private GatepassTypeEnum gatepassTypeEnum;
    private String personFirstName;
    private String personLastName;
    private String description;
    private String passNumber;
    private String contents;
    private String vehicleNumber;
    private String purpose;
    private LocalDate inTime;
    private String watchManName;
    private String designation;
}

