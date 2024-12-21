package com.example.internetslider.models

import com.example.internetslider.R
import java.io.Serializable

class Page(
    val title: String,
    val url: String,
) : Serializable{
    companion object{
        val pageList = mutableListOf(
            Page("News", "https://edition.cnn.com/"),
            Page("Music", "https://music.yandex.ru/home"),
            Page("Movies", "https://www.kinopoisk.ru/"),
            Page("Weather", "https://www.gismeteo.ru/"),
            Page("Search", "https://www.perplexity.ai/"),
            Page("Translator", "https://www.deepl.com/"),
            )
    }}