package ru.netology.servic

import ru.netology.Exception.PostNotFoundException
import ru.netology.data.Comment
import ru.netology.data.Post

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val postId = post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        posts += postId
        return posts.last()
    }


    fun update(post: Post): Boolean {
        var result = false
        val (id, ownerId, fromId, createdBy, _, text, replyOwnerId, replyPostId, friendsOnly,
            comments, copyright, likes, reposts, views, donut, postSource, geo, copyHistory, postType, signerId, canPin,
            canDelete, canEdit, isPinned, markedAsAds, isFavorite, postponedId) = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(ownerId = ownerId, fromId = fromId, createdBy = createdBy, text = text,
                    replyOwnerId = replyOwnerId, replyPostId = replyPostId, friendsOnly = friendsOnly,
                    comments = comments, copyright = copyright, likes = likes, reposts = reposts, views = views,
                    donut = donut, postSource = postSource, geo = geo, copyHistory = copyHistory, postType = postType,
                    signerId = signerId, canPin = canPin, canDelete = canDelete, canEdit = canEdit, isPinned = isPinned,
                    markedAsAds = markedAsAds, isFavorite = isFavorite, postponedId = postponedId)
                result = true
            }
        }
        return result
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (postId == post.id.toInt()) comments += comment else throw PostNotFoundException("Post with this ${postId} not found!")
            return comments.last()
        }
        return comments.last()
    }

    fun clear() {
        posts = emptyArray<Post>()
    }
}