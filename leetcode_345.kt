class Solution {
    
        fun reverseVowels(s: String): String {
            var left = 0
            var right = s.length - 1
            val array = StringBuilder(s)

            while (left < right) {
                if (!isVowel(array[left].toLowerCase()))
                    left++
                else if (!isVowel(array[right].toLowerCase()))
                    right--
                else {
                    val temp = array[left]
                    array[left] = array[right]
                    array[right] = temp
                    left++
                    right--
                }
            }
            return array.toString()
        }

        fun isVowel(char: Char): Boolean {
            return char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'
        }
}
