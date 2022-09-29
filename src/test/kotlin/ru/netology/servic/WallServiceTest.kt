package ru.netology.servic

import org.junit.Test

import org.junit.Assert.*
import ru.netology.Exception.PostNotFoundException
import ru.netology.data.*

class WallServiceTest {

    @Test
    fun createComment_IdCoincide() {
        // arrange
        val comment = Comment(1)
        WallService.clear()
        val expected = Comment(1)
        // act
        val actual = WallService.createComment(1, comment)
        // assert
        assertEquals(expected, actual)
    }
    @Test(expected = PostNotFoundException::class)
    fun createComment_IdDidNotMatch() {
        // arrange
        val comment = Comment(4)
        WallService.clear()
        // act
        val actual = WallService.createComment(5, comment)
    }

    @Test
    fun add_heckForZero() {
        // arrange
        val post = Post(
            postSource = PostSource(),
            geo = Geo(),
            copyHistory = СopyHistory()
        )
        WallService.add(post)
        WallService.clear()
        val expected = Post(
            id = 1,
            postSource = PostSource(),
            geo = Geo(),
            copyHistory = СopyHistory()
        )
        // act
        val actual = WallService.add(post)
        // assert
        assertEquals(expected, actual)
    }

    @Test
    fun update_returnsTrue() {
        // arrange
        val post = Post(
            postSource = PostSource(),
            geo = Geo(),
            copyHistory = СopyHistory()
        )
        WallService.add(post)
        WallService.add(post)
        WallService.add(post)
        val post1 = Post(
            id = 3,
            postSource = PostSource(),
            geo = Geo(),
            copyHistory = СopyHistory()
        )
        // act
        val result = WallService.update(post1)
        // assert
        assertTrue(result)
    }

    @Test
    fun update_returnsFalse() {
        // arrange
        val post = Post(
            postSource = PostSource(),
            geo = Geo(),
            copyHistory = СopyHistory()
        )
        WallService.add(post)
        WallService.add(post)
        WallService.add(post)
        val post1 = Post(
            id = 4,
            postSource = PostSource(),
            geo = Geo(),
            copyHistory = СopyHistory()
        )
        // act
        val result = WallService.update(post1)
        // assert
        assertFalse(result)
    }
}