package introduction.task03

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Task03Tests {

    @Test
    fun given_twoArguments_whenAddIsInvoked_thenShouldReturnTheirSum() {

        val sum = add(7, 3)
        assertEquals(10, sum)
    }
}