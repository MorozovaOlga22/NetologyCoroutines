package dto

import kotlinx.coroutines.Deferred

data class InitPostState(
    val post: Post,
    val commentsDeferred: Deferred<List<Comment>>,
    val authorDeferred: Deferred<Author>
)