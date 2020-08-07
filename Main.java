  
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    int [] list = {10, 9, 7, 4, 3, 13, 11, 1, 8, 6, 14, 17, 2, 19, 20, 5, 15, 0, 16, 12, 18};

    System.out.println(Arrays.toString(Sorter.bubble_sort(list)));
    System.out.println(Arrays.toString(Sorter.selection_sort(list)));
    System.out.println(Arrays.toString(Sorter.insertion_sort(list)));
    System.out.println(Arrays.toString(Sorter.heap_sort(list)));
    System.out.println(Arrays.toString(Sorter.merge_sort(list)));
    System.out.println(Arrays.toString(Sorter.quick_sort(list)));

  }
}