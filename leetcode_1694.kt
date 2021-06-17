class Solution {
    fun reformatNumber(number: String): String {
            val reformatString = StringBuffer("")
            var length = number.length
            for (i in 0 until length) {
                if (number[i].isDigit())
                    reformatString.append(number[i])
            }
            length = reformatString.length
            when {
                length <= 3 -> return reformatString.toString()
                length == 4 -> {
                    return reformatString.insert(2, '-').toString()
                }
                else -> {
                    var i = 3
                    while (i < reformatString.length) {
                        reformatString.insert(i, '-')
                        i++
                        val remainLength = (reformatString.length - i)
                        i += when {
                            remainLength <= 3 -> {
                                remainLength
                            }
                            remainLength == 4 -> {
                                2
                            }
                            else -> {
                                3
                            }
                        }
                    }
                }
            }
            return reformatString.toString()
        }
}
