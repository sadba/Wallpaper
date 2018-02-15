package com.lab.sadba.wallpaper2.Interface;

import com.lab.sadba.wallpaper2.Model.Accueil;
import com.lab.sadba.wallpaper2.Model.News;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sadba on 15-Feb-18.
 */

public interface NewsService {

    @GET("apiGet/get_acceuil")
    Call<Accueil> getAccueils();
}
