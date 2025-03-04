package data

data class Post(
    var id: Long,
    val ownerId: Long,
    val fromId: Long,
    val date: Long,
    val replyOwnerId: Long? = null,
    val replyPostId: Long? = null,
    val comments: Comments? = Comments(),
    val original: Post? = null,
    val likes: Likes = Likes(),
    val isFavorite: Boolean = false,
    val postType: String = "post" // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
) {
    override fun toString(): String {
        return "Post(id=$id, ownerId=$ownerId, fromId=$fromId, date=$date, replyOwnerId=$replyOwnerId, replyPostId=$replyPostId, comments=$comments, original=$original, likes=$likes, isFavorite=$isFavorite, postType='$postType')"
    }
}