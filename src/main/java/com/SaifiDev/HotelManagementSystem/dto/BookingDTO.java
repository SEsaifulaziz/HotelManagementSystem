package com.SaifiDev.HotelManagementSystem.dto;

import com.SaifiDev.HotelManagementSystem.entity.Room;
import com.SaifiDev.HotelManagementSystem.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.joda.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private Long id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int numOfAdults;

    private int numOfChildren;

    private String bookingConfirmation;

    private User user;

    private Room room;

}
