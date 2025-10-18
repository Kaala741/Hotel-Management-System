package com.Kaala_dev.HSM.service.interfac;

import com.Kaala_dev.HSM.dto.LoginRequest;
import com.Kaala_dev.HSM.dto.Response;
import com.Kaala_dev.HSM.entity.User;

public interface IUserService {
    public abstract Response register(User user);

    public abstract Response login(LoginRequest loginRequest);

    public abstract Response getAllUsers();

    public abstract Response getUserBookingHistory(String userId);

    public abstract Response deleteUser(String userId);

    public abstract Response getUserById(String userId);

    public abstract Response getMyInfo(String email);
}
