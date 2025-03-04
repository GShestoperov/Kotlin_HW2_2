package data

data class Likes (
    val count: Int = 0,
    val userLikes: Boolean = false,
    val canLike: Boolean = false,
    val canPublish: Boolean = false
) {
    override fun toString(): String {
        return "Likes(count=$count, userLikes=$userLikes, canLike=$canLike, canPublish=$canPublish)"
    }
}