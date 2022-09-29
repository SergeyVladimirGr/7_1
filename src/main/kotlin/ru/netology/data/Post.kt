package ru.netology.data

data class Post(
    val id: Long = 0,   //Идентификатор записи
    val ownerId: Long = 0, //Идентификатор владельца стены, на которой размещена запись
    val fromId: Long = 0, //Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Long = 0, //Идентификатор администратора, который опубликовал запись
    val date: Long = 1651580805, //Время публикации записи в формате unixtime
    val text: String = "", //Текст записи
    val replyOwnerId: Long = 0, //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Long = 0, //Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Int = 0, //1, если запись была создана с опцией «Только для друзей»

    val comments: Comments = Comments(),    //Информация о комментариях к записи, объект с полями
    val copyright: Copyright = Copyright(),    //Источник материала, объект с полями
    val likes: Likes = Likes(),    //Информация о лайках к записи, объект с полями
    val reposts: Reposts = Reposts(),    //Информация о репостах записи («Рассказать друзьям»), объект с полями
    val views: Views = Views(),    //Информация о просмотрах записи. Объект с единственным полем
    val donut: Donut = Donut(),    //Информация о записи VK Donut, объект с полями

    val postSource: PostSource?, //Информация о способе размещения записи
    val geo: Geo?, //Информация о местоположении
    val copyHistory: СopyHistory?, //Массив содержащий историю репостов для записи

    val postType: String = "", //Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val signerId: Long = 0, //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val canPin: Boolean = false, //Информация о том, может ли текущий пользователь закрепить запись (t — может, f — не может)
    val canDelete: Boolean = false, //Информация о том, может ли текущий пользователь удалить запись (t — может, f — не может)
    val canEdit: Boolean = false, //Информация о том, может ли текущий пользователь редактировать запись (t — может, f — не может)
    val isPinned: Boolean = false, //Информация о том, что запись закреплена
    val markedAsAds: Boolean = false, //Информация о том, содержит ли запись отметку «реклама»
    val isFavorite: Boolean = false, //true, если объект добавлен в закладки у текущего пользователя
    val postponedId: Long = 0 //Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
)