package com.example.navigation.myapplication

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*
import org.junit.Test

class ResourceComparerTest {


   ///dont do this
   private val re = ResourceComparer()


    @Test
    fun stringResourceSameAsGivenString_returntrue() {
        val con = ApplicationProvider.getApplicationContext<Context>()
     val result = re.isEquals(con, R.string.app_name, "My Application")
        assertTrue(result )
    }
}