package ru.netology.`interface`

interface Attachments {
    val type: String
}

data class AudioAttachment (
    override val type: String = "audio",
    val audio: Audio = Audio()
): Attachments

data class Audio(
    val id: Int = 1,
    val artist: String = "",
    val title: String = ""
)

data class VideoAttachment (
    override val type: String = "video",
    val video: Video = Video()
): Attachments

data class Video(
    val id: Int = 1,
    val title: String = "",
    val duration: Int = 0
)

data class DocAttachment (
    override val type: String = "doc",
    val doc: Doc = Doc()
): Attachments

data class Doc(
    val id: Int = 1,
    val title: String = "",
    val size: Int = 0
)

data class LinkAttachment (
    override val type: String = "link",
    val link: Link = Link()
): Attachments

data class Link(
    val url: String = "",
    val title: String = ""
)

data class PhotoAttachment (
    override val type: String = "photo",
    val photo: Photo = Photo()
): Attachments

data class Photo(
    val id: Int = 1,
    val text: String = "",
    val date: Long = 1651580906
)