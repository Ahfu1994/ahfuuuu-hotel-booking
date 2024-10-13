package com.chiradet.AhfuuuHotel.service.interfac;

import com.chiradet.AhfuuuHotel.dto.Response;
import com.chiradet.AhfuuuHotel.entiry.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
