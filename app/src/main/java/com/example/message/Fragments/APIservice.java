package com.example.message.Fragments;

import com.example.message.Notifications.MyResponse;
import com.example.message.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIservice {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAshKw8D4:APA91bEHy8ukJlNl2FOUTHSmJrmfiwwM7-pH2xf3scmEinqEWYRog6dVtFCoGMLVuRQJsPAcQOd8o_6RdK4U-X0Ul5eHAjCZ-f7TbdvK2PpsLAl4wcDjcihRn_kSD7UsaSFsgEOEEQAi"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
