fun main() {
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list2) {
        if (item % 2 == 0) {
            toRemove.add(item)
        }
    }
    list2.removeAll(toRemove)
    println(list2) // Output: [1, 3, 5]

    //Alternative solution using filter and toList
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val list4 = list3.filter { it % 2 != 0 }.toMutableList()
    println(list4) // Output: [1,3,5]
}