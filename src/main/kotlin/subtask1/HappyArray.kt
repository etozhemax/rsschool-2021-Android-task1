package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArrayMutable = sadArray.toMutableList()

        var index = 0
        while (index < sadArrayMutable.size) {
            if (index > 0 && index < sadArrayMutable.size - 1) {
                if (sadArrayMutable[index - 1] + sadArrayMutable[index + 1] < sadArrayMutable[index]) {
                    sadArrayMutable.removeAt(index)
                    index = 0;
                }
            }
            index++
        }

        return sadArrayMutable.toIntArray()
    }
}
