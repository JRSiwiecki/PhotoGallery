package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "b0ef0a2eb5b96241f9af9e82d51ed43c"
interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): String
}