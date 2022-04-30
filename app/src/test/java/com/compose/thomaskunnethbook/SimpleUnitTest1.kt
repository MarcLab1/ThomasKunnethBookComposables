package com.compose.thomaskunnethbook

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class SimpleUnitTest1 {
    companion object {
        @BeforeClass
        @JvmStatic
        fun setupAll() {
            println("Setting things up")
        }
    }
    @Before
    fun setup() {
        println("Setup test")
    }
    @After
    fun teardown() {
        println("Clean up test")
    }
    @Test
    fun testListOfInts() {
        val nums = listOf(Int.MIN_VALUE, -3, -2, 2, 3,
            Int.MAX_VALUE)
        val results = listOf(true, false, true, true, false,
            false)
        nums.forEachIndexed { index, num ->
            val result = isEven(num)
            println("isEven($num) returns $result")
            assertEquals(result, results[index])
        }
    }
}

class SimpleUnitTest2{
    @Test
    fun doSomethingWithAList()
    {
        var list = listOf<Int>(1,2,3,4)
        assertEquals(list.size, 4)

        assertEquals(list.contains(1), true)

        assertNotEquals(list.contains(44), true)
    }

}