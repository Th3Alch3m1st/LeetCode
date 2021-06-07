class Solution {
    fun addStrings(num1: String, num2: String): String {
            val sumResult = StringBuilder("")
            var num1Length = num1.length - 1
            var num2Length = num2.length - 1
            var remain = 0
            while (num1Length >= 0 || num2Length >= 0) {

                val sum =
                    ((num1.getOrNull(num1Length) ?: '0') - '0') + ((num2.getOrNull(num2Length) ?: '0') - '0') + remain
                sumResult.append(sum % 10)
                remain = sum / 10
                num1Length--
                num2Length--
            }
            if (remain != 0) {
                sumResult.append(remain)
            }

            return sumResult.toString().reversed()
        }
}
