package com.example.androidlatihan11pr.model

class MovieResponse (var page : Int,
    val results : ArrayList<Movie>,
    val totalResult : Int,
    val totalPage : Int)