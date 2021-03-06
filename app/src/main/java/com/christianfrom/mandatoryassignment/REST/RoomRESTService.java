package com.christianfrom.mandatoryassignment.REST;

import com.christianfrom.mandatoryassignment.Model.Room;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RoomRESTService {
    @GET("rooms")
    Call<List<Room>> getAllRooms();

}
