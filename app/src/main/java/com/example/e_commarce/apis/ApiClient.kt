package com.example.e_commarce.apis

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiClient {


    companion object{


        private fun getOkHttpClient(): OkHttpClient {
            return OkHttpClient.Builder().build()
        }
        fun getRetrofit(): Retrofit {
            val retrofit = Retrofit.Builder().
            baseUrl("https://jsonplaceholder.typicode.com/").
            addConverterFactory(GsonConverterFactory.create()).
            client(getOkHttpClient()).
            build()
            return retrofit
        }
    }
}
//GsonConverterFactory