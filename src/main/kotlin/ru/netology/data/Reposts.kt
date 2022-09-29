package ru.netology.data

data class Reposts(
    val count: Long = 0, //число пользователей, скопировавших запись
    val userReposted: Boolean = false, //наличие репоста от текущего пользователя
)