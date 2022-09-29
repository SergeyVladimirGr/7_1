package ru.netology.data

data class Donut(
    val isDonut: Boolean = false,   //запись доступна только платным подписчикам VK Donut
    val paidDuration: Long = 0,   //время, в течение которого запись будет доступна только платным подписчикам VK Donut
    val placeholder: String = "нет оплаты",   //запись доступна только платным подписчикам VK Donut
    val canPublishFreeCopy: Boolean = false,   //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    val editMode: String = "all",   //информация о том, какие значения VK Donut можно изменить в записи. Возможные значения
)