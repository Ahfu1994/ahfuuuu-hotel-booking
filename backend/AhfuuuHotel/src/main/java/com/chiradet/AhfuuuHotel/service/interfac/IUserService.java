package com.chiradet.AhfuuuHotel.service.interfac;

import com.chiradet.AhfuuuHotel.dto.LoginRequest;
import com.chiradet.AhfuuuHotel.dto.Response;
import com.chiradet.AhfuuuHotel.entiry.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
