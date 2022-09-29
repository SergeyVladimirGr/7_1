package ru.netology.data

data class Comments(
    val count: Long = 0,   //количество комментариев
    val canPost: Boolean = true,   //информация о том, может ли текущий пользователь комментировать запись
    val groupsCanPost: Boolean = true,   //информация о том, могут ли сообщества комментировать запись
    val canClose: Boolean = true,   //может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean = true,   //может ли текущий пользователь открыть комментарии к записи
)