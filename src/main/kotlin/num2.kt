
fun num2(inString: String): MutableMap<Char, Int> {
    //val string = (readLine() + " ").lowercase(Locale.getDefault())
    val string = "$inString "//без пробела в конце никак
    val repeats = mutableMapOf<Char, Int>()
    var currentRepeats = 1
    for (i in 1 until string.length)
        if (string[i - 1] == string[i]) currentRepeats += 1 else {
            if (repeats.getOrDefault(string[i-1], 0) < currentRepeats)
                repeats[string[i - 1]] = currentRepeats
            currentRepeats = 1
        }
    //println(repeats)
    return repeats
}
