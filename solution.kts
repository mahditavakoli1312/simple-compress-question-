val chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')

compress(chars)

fun compress(chars: CharArray): Int {

    var currentChar = chars.first()
    var currentRepeat = 0
    val resList = mutableListOf<String>()
    var oldChar: Char

    chars.forEach { char ->
        oldChar = currentChar

        if (oldChar.equals(char)) {
            currentRepeat++
        } else {
            resList.add(oldChar.toString())
            resList.add("$currentRepeat")
            currentRepeat = 1
        }
        currentChar = char
    }

    if (chars[chars.size - 1] == chars[chars.size - 2]) {
        resList.add(chars[chars.size - 1].toString())
        resList.add((currentRepeat).toString())
    } else {
        resList.add(chars[chars.size - 1].toString())
        resList.add("1")
    }
    return resList.size
}
