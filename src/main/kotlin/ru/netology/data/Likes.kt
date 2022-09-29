package ru.netology.data

data class Likes(
    val count: Long = 0,   //число пользователей, которым понравилась запись
    val userLikes: Boolean = false,   //наличие отметки «Мне нравится» от текущего пользователя
    val canLike: Boolean = true,   //информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    val canPublish: Boolean = true,   //информация о том, может ли текущий пользователь сделать репост записи
)