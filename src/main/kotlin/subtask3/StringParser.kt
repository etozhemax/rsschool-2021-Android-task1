package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var resultList = mutableListOf<String>()

        for ((index, element) in inputString.withIndex())
        {
            var isSkipped = false
            if (inputChars.keys.contains(element)) {

                for (innerIndex in (index + 1) until inputString.length) {
                    if (inputString[innerIndex] == element) {
                        isSkipped = true
                    }
                    if ((inputString[innerIndex] == inputChars[element])) {
                        if (isSkipped) {
                            isSkipped = false
                            continue
                        }

                        resultList.add(inputString.substring(index + 1, innerIndex))
                        break
                    }
                }


            }
        }

        return resultList.toTypedArray()
    }

    companion object {
        val inputChars = mapOf<Char, Char>('<' to '>', '[' to ']', '(' to ')')
    }
}
