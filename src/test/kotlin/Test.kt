import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun num2(){
        assertTrue(areEqual(mutableMapOf(), num2("")))
        assertTrue(areEqual(mutableMapOf('a' to 1), num2("a")))
        assertTrue(areEqual(mutableMapOf('a' to 1, 'b' to 1),
            num2("bab")))
        assertTrue(areEqual(mutableMapOf('a' to 1, 'b' to 1, 'c' to 2),
            num2("baccb")))
        assertTrue(areEqual(mutableMapOf('a' to 10, 'b' to 1),
            num2("baaaaaaaaaab")))
    }
    private fun areEqual(first: MutableMap<Char, Int>,
                         second:MutableMap<Char, Int>): Boolean{
        if (first.size != second.size) return false
        for (key in first.keys) {
            if (first[key] != second[key]) return false
        }
        return true
    }
}