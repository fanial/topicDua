package com.f4l.topicdua.latihan_dua

import java.io.Serializable

data class DataNews(val title : String, val  date : String, val image : Int, val content : String, val writer : String) : Serializable {
}