package ru.netology

import ru.netology.Exception.PostNotFoundException
import ru.netology.`interface`.*
import ru.netology.data.*
import ru.netology.servic.WallService

fun main() {
    val post = Post(
        likes = Likes(5),
        postSource = PostSource(),
        geo = Geo(),
        copyHistory = СopyHistory()
    )
    val post1 = Post(
        id = 3,
        likes = Likes(50),
        postSource = PostSource(),
        geo = Geo(),
        copyHistory = СopyHistory()
    )

    val resultId1 = WallService.add(post)
    val resultId2 = WallService.add(post)
    val resultId3 = WallService.add(post)
    println(resultId1)
    println(resultId2)
    println(resultId3)

    val result = WallService.update(post1)
    println(result)

    val audio = AudioAttachment()
    val video = VideoAttachment()
    val doc = DocAttachment()
    val link = LinkAttachment()
    val photo = PhotoAttachment()

    var attachments = emptyArray<Attachments>()
    attachments += audio
    attachments += video
    attachments += doc
    attachments += link
    attachments += photo

    println(attachments.size)
    println(attachments.last())

    val comment = Comment()

    try {
        val resultCom = WallService.createComment(1, comment)
        println(resultCom)
        val resultCom1 = WallService.createComment(5, comment)
        println(resultCom1)
    } catch (e: PostNotFoundException) {
        println("Post with this id not found!")
    }
}