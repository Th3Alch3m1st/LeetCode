fun twoSumUsingMap(nums: IntArray, target: Int): IntArray {
            val resultArray = mutableListOf<Int>()
            val numMap = mutableMapOf<Int, Int>()
            run brk@{
                nums.forEachIndexed { index, value ->
                    val secondValue = target - value
                    val result = numMap[secondValue]
                    result?.let {
                        resultArray.add(result)
                        resultArray.add(index)
                        return@brk
                    } ?: run {
                        numMap[value] = index
                    }
                }
            }
            return resultArray.toIntArray()
        }

        fun twoSumUsingSort(nums: IntArray, target: Int): IntArray {
            val resultArray = mutableListOf<Int>()
            val numPairList = mutableListOf<Pair<Int, Int>>()
            nums.forEachIndexed { index, value ->
                numPairList.add(Pair(value, index))
            }
            numPairList.sortBy { pair -> pair.first }
            var firstIndex = 0
            var endIndex = nums.size - 1
            while (firstIndex < endIndex) {
                val sum = numPairList[firstIndex].first + numPairList[endIndex].first
                if(sum>target){
                    endIndex--
                }else if(sum<target){
                    firstIndex++
                }else{
                    resultArray.add(numPairList[firstIndex].second)
                    resultArray.add(numPairList[endIndex].second)
                    break
                }
            }
            return resultArray.toIntArray()
        }
