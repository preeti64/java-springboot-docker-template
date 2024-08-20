package com.resttemplate.microservicestartertemplate.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetail {

    private int statusCode;
    private String message;
    private String details;
    private Date timestamp;

}

