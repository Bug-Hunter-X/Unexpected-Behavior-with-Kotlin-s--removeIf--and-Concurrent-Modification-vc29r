fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    // The bug appears when using removeIf with a List or Set where the predicate modifies the collection during iteration
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeIf { 
        val result = it % 2 == 0
        if(result) {
            list2.add(6) //Adding a new element during iteration
        }
        result
    }
    println(list2) //Output may vary due to concurrent modification. It might throw ConcurrentModificationException
}