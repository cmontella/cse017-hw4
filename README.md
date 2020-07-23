# CSE 017 - Homework 4

Remember I want to see 1 commit for each question (at least). This means your repository should have at least 12 commits. This time I'll take points off if you don't follow this instruction.

## Question 1

Create a class called `Sorter.java`. Stub out the following static methods:

- `public static ArrayList<int> selection_sort(ArrayList<int> list){}`
- `public static ArrayList<int> insertion_sort(ArrayList<int> list){}`
- `public static ArrayList<int> bubble_sort(ArrayList<int> list){}`
- `public static ArrayList<int> merge_sort(ArrayList<int> list){}`
- `public static ArrayList<int> quick_sort(ArrayList<int> list){}`
- `public static ArrayList<int> heap_sort(ArrayList<int> list){}`

## Questions 2 - 6

The bulk of this assignment will be to implement each of these sorting algorithms in Java. For your readings this week I gave you a number of wikipedia articles regarding these algorithms. In each one, there is a section with pseudocode that tells you how to implement the algorithm in a language that is not specific to any programming language. You can translate this to Java code almost verbatim. 

I want you to *implement 2 of the above algorithms without looking at the pseudocode or any other implementation online*, and you can implement the rest of them by looking at the code. One of the two must be either selection, insertion, or bubble sort. The other one must be either merge, quick, or heap sort. 

In your answer, indicate for which ones you looked at the pseudocode, and which ones you didn't. The way I would go about this assignment is start by implementing one of the `O(n^2)` algorithms looking at the pseudocode, and then try to do one without. This will help you gain practice, and these algorithms are easier to implement. Then move on to one of the `O(nlogn)` algorithms.

You can add any helper methods you wish to the class to help with sorting (e.g. `heapify()` for heap sort)

## Questions 7 - 12

In Main.java, create a main method with an array list of at least 20 integers elements. Show that each of the methods correctly sorts the array list.
