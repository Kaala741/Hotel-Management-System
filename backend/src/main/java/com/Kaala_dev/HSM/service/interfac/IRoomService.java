package com.Kaala_dev.HSM.service.interfac;

import com.Kaala_dev.HSM.dto.Response;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IRoomService {
    public abstract Response addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice, String description);

    public abstract List<String> getAllRoomTypes();

    public abstract Response getAllRooms();

    public abstract Response deleteRoom(Long roomId);

    public abstract Response updateRoom(Long roomId, String description, String roomType, BigDecimal roomPrice, MultipartFile photo);

    public abstract Response getRoomById(Long roomId);

    public abstract Response getAvailableRoomsByDataAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    public abstract Response getAllAvailableRooms();
}
