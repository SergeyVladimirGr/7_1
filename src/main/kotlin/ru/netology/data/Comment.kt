package ru.netology.data

data class Comment(
    val Id: Int = 0,   //Идентификатор комментария
    val from_id: Int = 0,   //Идентификатор автора комментария
    val date: Int = 1651580805,   //Дата создания комментария в формате Unixtime
    val text: String = "",   //Текст комментария

    val donut: Donut = Donut(),   //Информация о VK Donut. Объект со следующими полями

    val reply_to_user: Int = 0,   //Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо)
    val reply_to_comment: Int = 0,   //Идентификатор комментария, в ответ на который оставлен текущий (если применимо)
    )