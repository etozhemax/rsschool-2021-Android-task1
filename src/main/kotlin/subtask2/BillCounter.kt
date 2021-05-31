package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sumToPay = (bill.sum() - bill[k]) / 2;

        if (sumToPay == b) {
            return BonAppetit
        } else {
            return (b - sumToPay).toString()
        }
    }

    companion object {
        const val BonAppetit = "Bon Appetit"
    }
}
