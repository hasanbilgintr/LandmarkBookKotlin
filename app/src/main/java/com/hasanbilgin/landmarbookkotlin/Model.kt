package com.hasanbilgin.landmarbookkotlin

import java.io.Serializable

//Serializable  bundle ile atarken ekledik serileştirmek
class Model(val name: String, val country: String, val image: Int): Serializable {


}