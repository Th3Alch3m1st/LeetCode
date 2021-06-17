class Solution {
    fun maxVowels(s: String, k: Int): Int {
            var maxVowel = 0
            val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
            val length = s.length
            for(i in 0 until k){
                if (vowels.contains(s[i])) {
                    maxVowel++
                }
            }
            var temp = maxVowel
            for (i in k until length) {
                if(vowels.contains(s[i-k])){
                    temp--
                }
                if(vowels.contains(s[i])){
                    temp++
                }
                if(temp>maxVowel){
                    maxVowel = temp
                }
            }
            return maxVowel
        }
}
