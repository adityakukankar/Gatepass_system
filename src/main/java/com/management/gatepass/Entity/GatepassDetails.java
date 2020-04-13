package com.management.gatepass.Entity;

import com.management.gatepass.Constants.GatepassTypeEnum;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Builder
@ToString
@Setter @Getter
@Document(collection = "gatepassdetails" )
public class GatepassDetails {
    private LocalDate date;
    private String location;
    private GatepassTypeEnum gatepassTypeEnum;
    //get this from user details
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
    private String AuthPersonName;
}

