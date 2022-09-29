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

    val comment1 = Comment(1)
    val comment2 = Comment(2)
    val comment3 = Comment(3)
    val comment4 = Comment(4)
    try {
        val resultCom1 = WallService.createComment(1, comment1)
        println(resultCom1)
        val resultCom2 = WallService.createComment(2, comment2)
        println(resultCom2)
        val resultCom3 = WallService.createComment(3, comment3)
        println(resultCom3)
        val resultCom4 = WallService.createComment(5, comment4)
        println(resultCom4)
    } catch (e: PostNotFoundException) {
        println("Post with this ${comment4.Id} not found!")
    }
}