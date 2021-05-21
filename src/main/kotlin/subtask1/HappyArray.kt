package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var i = 1

        val list = sadArray.toMutableList()

        while (i < list.size - 1) {
            if ( i != 0 && list[i] > list[i + 1] + list[i - 1]) {
                list.removeAt(i)
                i --
            } else {
                i ++
            }
        }
        return list.toIntArray()
    }
}
