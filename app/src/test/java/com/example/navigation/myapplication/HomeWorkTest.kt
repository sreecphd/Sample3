package com.example.navigation.myapplication

import junit.framework.TestCase
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class HomeWorkTest : TestCase() {

    public override fun setUp() {
        super.setUp()
    }


    @Test
    fun testInputlessthanorEqualto1() {
        var n = 1
        assertEquals(1L, HomeWork.fib(n))
        n = 0
        assertEquals(0L, HomeWork.fib(n))
    }

    @Test
    fun testInputValid() {
        var n = 2
        assertEquals(1L, HomeWork.fib(n))
    }
    public override fun tearDown() {}
}