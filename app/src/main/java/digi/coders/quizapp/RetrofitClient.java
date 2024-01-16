package digi.coders.quizapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

   public static ApiServices getClient(){
       Retrofit retrofit=new Retrofit.Builder()
               .baseUrl("https://quizapi.io/api/v1/")
               .addConverterFactory(GsonConverterFactory.create())
               .build();
       ApiServices apiServices=retrofit.create(ApiServices.class);
       return apiServices;

   }
}
