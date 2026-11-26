package com.android.googlebooks.network

import com.android.googlebooks.BuildConfig
import com.android.googlebooks.data.BooksResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GoogleBooksApi {
    @GET("volumes")
    suspend fun searchVolumes(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int = 10,
        @Query("key") apikey: String,
    ): BooksResponse
}