package com.SaifiDev.HotelManagementSystem.repository;

import com.SaifiDev.HotelManagementSystem.entity.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);

    List<Booking> findByUserId(Long userId);

    List<Booking> findByBookingConfirmationCode(String confirmationCode);
}
