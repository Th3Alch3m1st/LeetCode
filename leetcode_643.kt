fun findMaxAverage(nums: IntArray, k: Int): Double {
            var maximumSum = 0.0
            for (i in 0 until k){
                maximumSum+=nums[i]
            }
            var currentSum = maximumSum
            for(i in k until nums.size){
                currentSum = currentSum+nums[i]-nums[i-k]
                if(currentSum>maximumSum){
                    maximumSum = currentSum
                }
            }

            return maximumSum/k
        }
