package introduction.task04

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task04Tests {

    @Test
    fun `GIVEN a string WHEN wrapped THEN should be wrapped with prefix and suffix`() {
        val str = "Kotlin"
        val expected = "[Kotlin]"
        val actual = wrap(str, '[', ']')
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN a string with no prefix and suffix supplied WHEN wrapped THEN should be wrapped with default prefix and suffix`() {
        val str = "Kotlin"
        val expected = "[Kotlin]"
        val actual = wrap(str, "[", "]")
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN three ints WHEN summed THEN should return their sum`() {
        val expected = 40
        val actual = sum(10, 20, 10)
        assertEquals(expected, actual)
    }
}