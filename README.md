# Kotlin `removeIf` Concurrent Modification Bug

This repository demonstrates a subtle bug related to using Kotlin's `removeIf` function on mutable collections. When the predicate within `removeIf` modifies the collection during iteration, it can lead to unexpected behavior or a `ConcurrentModificationException`. 

The `bug.kt` file shows an example where adding an element within the `removeIf` predicate causes unpredictable results. The `bugSolution.kt` file offers a solution to address this issue.

## How to reproduce

1. Clone this repository.
2. Open `bug.kt` and observe the output. Notice the unexpected behavior or exception.
3. Open `bugSolution.kt` and observe the corrected behavior.