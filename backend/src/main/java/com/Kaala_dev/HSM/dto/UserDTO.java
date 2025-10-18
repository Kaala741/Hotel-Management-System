package com.Kaala_dev.HSM.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private String PhoneNumber;
    private String role;
    private List<BookingDTO> bookings=new ArrayList<>();

}
