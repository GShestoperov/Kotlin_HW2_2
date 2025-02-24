package service

import data.Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

   @Test
   fun addPost() {
    val service = WallService()

    val result = service.addPost(
          Post(
           id = 0,
           ownerId = 1,
           fromId = 1,
           date = 100
          )
    )

    assertEquals(result, Post(
     id = 1,
     ownerId = 1,
     fromId = 1,
     date = 100
    )
    )

   }

   @Test
   fun updatePost_test1() {
       val service = WallService()

       service.addPost(Post(
           id = 0,
           ownerId = 1,
           fromId = 1,
           date = 100
       ))
       service.addPost(Post(
           id = 0,
           ownerId = 2,
           fromId = 2,
           date = 150
       ))

       val result = service.updatePost(Post(
           id = 1,
           ownerId = 10,
           fromId = 10,
           date = 250
       ))

       assertTrue(result)
   }

    @Test
    fun updatePost_test2() {
        val service = WallService()

        service.addPost(Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            date = 100
        ))
        service.addPost(Post(
            id = 0,
            ownerId = 2,
            fromId = 2,
            date = 150
        ))

        val result = service.updatePost(Post(
            id = 3,
            ownerId = 10,
            fromId = 10,
            date = 250
        ))

        assertFalse(result)
    }
}