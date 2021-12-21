package dto

import kotlinx.coroutines.Deferred

data class MiddlePostState(
    val post: Post,
    val commentsDeferred: List<Deferred<CommentWithAuthor>>,
    val authorDeferred: Deferred<Author>
)