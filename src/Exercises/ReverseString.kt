package Exercises

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {

    val sbPhrase = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {
        sbPhrase.append(str[1])
        i--
    }
    return sbPhrase.toString()
}