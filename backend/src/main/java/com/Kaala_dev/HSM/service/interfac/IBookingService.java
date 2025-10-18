package com.Kaala_dev.HSM.service.interfac;

import com.Kaala_dev.HSM.dto.Response;
import com.Kaala_dev.HSM.entity.Booking;

public interface IBookingService {
    public abstract Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    public abstract Response findBookingByConfirmationCode(String confirmationCode);

    public abstract Response getAllBookings();

    public abstract Response cancelBooking(Long bookingId);
}
