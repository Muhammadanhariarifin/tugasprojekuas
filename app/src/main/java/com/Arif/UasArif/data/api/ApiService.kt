package com.Arif.UasArif.data.api

import com.Arif.UasArif.data.model.ListResponse
import com.Arif.UasArif.data.model.MovieResponse
import com.Arif.UasArif.data.model.TvShowResponse
import com.Arif.UasArif.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}