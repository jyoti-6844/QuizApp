package digi.coders.quizapp;

import com.google.gson.JsonArray;

import java.security.Key;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiServices {

    @GET("questions")
    Call<JsonArray> QuizQuestion(
         @Header("X-Api-Key") String key
    );


}
