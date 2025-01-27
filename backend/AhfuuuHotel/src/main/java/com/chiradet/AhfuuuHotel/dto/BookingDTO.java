package com.chiradet.AhfuuuHotel.dto;

import com.chiradet.AhfuuuHotel.entiry.Room;
import com.chiradet.AhfuuuHotel.entiry.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumberOfGuest;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;
}
