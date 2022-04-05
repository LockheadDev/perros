package com.example.perros.response

import com.google.gson.annotations.SerializedName

data class PerroResponse(
    //Obtener los datos de JSON (puente de JSON a objeto)
    @SerializedName("status") var status : String,
    @SerializedName("message") var imagenes : List<String>)
