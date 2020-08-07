class Sorter {

  public static int[] selection_sort(int[] list) {
    int n = list.length;
    for (int i=0; i<n-1; i++) {
      int jMin = i;
      for (int j = i+1; j<n; j++) {
        if (list[j] < list[jMin]) {
          jMin = j;
        }
      }
      if (jMin != i) {
        int mem = list[i];
        list[i] = list[jMin];
        list[jMin] = mem;
      }
    }
    return list;

  }

  public static int[] insertion_sort(int[] list) {
    int n = list.length;
    for (int i=1; i<n; i++) {
      int k = i;
      int j = k-1;
      boolean swapped = true;
      while (swapped && j>=-1) {
        if (j==-1 || list[k]>=list[j]) {
           int mem = list[k];
           for (int x=k; x==j+2; x--) {
          list[x] = list[x-1];
           } 
           list[j+1] = mem;
           swapped = false;
        } else {
          j -= 1;
        }
      }
    }
    return list;
  }

  public static int[] bubble_sort(int[] list) {
    int n = list.length;
    boolean swapped = true;
    while (swapped == true){
      swapped = false;
      for (int i=1; i<n; i++) {
        if (list[i-1] > list[i]) {
          int mem = list[i-1];
          list[i-1] = list[i];
          list[i] = mem;
          swapped = true;
        }
      }
    }
    return list;
  }

  public static int[] merge_sort(int[] list) {
    int n = list.length;
    int[] new_list = new int[n];
    if (n==1) {
      new_list = list;
    } else {
      int m = (int) Math.floor(n / 2);
      int[] list1 = new int[m];
      int[] list2 = new int[n-m];
      for (int i=0; i<m; i++) {
        list1[i] = list[i];
      }
      for (int j=0; j<n-m; j++) {
        list2[j] = list[m+j];
      }
      int[] yL = merge_sort(list1);
      int[] yR = merge_sort(list2);
      new_list = merge(yL, yR);
    }
    return new_list;
  }

  public static int[] merge(int[] x, int[] y) {
    int nx = x.length;
    int ny = y.length;
    int[] z = new int[nx+ny];
    int ix = 0;
    int iy = 0;
    int iz = 0;
    while (ix<=nx-1 && iy <=ny-1) {
      if (x[ix]<=y[iy]) {
        z[iz] = x[ix];
        ix += 1;
        iz += 1;
      } else {
        z[iz] = y[iy];
        iy += 1;
        iz += 1;
      }
    }
    while (ix<nx) {
      z[iz] = x[ix];
      ix += 1;
      iz += 1;
    }
    while (iy<ny) {
      z[iz] = y[iy];
      iy += 1;
      iz += 1;
    }
    return z;
  }

  public static int[] quick_sort(int[] list) {
    int lo = 0;
    int hi = list.length-1;
    return quick_sort_recurse(list, lo, hi);
  }

  public static int[] quick_sort_recurse(int[] list, int lo, int hi) {
    if (lo < hi) {
      int p = partition(list, lo, hi);
      quick_sort_recurse(list, lo, p - 1);
      quick_sort_recurse(list, p + 1, hi);
    }
    return list;
  }

  public static int partition(int[] A, int lo, int hi) {
    int pivot = A[hi];
    int i = lo;
    for (int j=lo; j<=hi; j++) {
      if (A[j] < pivot) {
        int mem = A[i];
        A[i] = A[j];
        A[j] = mem;
        i += 1;
      }
    }
    int mem2 = A[i];
    A[i] = A[hi];
    A[hi] = mem2;
    return i;
  }

  public static int[] heap_sort(int[] list){
    int[] clone = new int[list.length];
    for (int i=0; i<list.length; i++) {
      clone[i] = list[i];
    }
    int end = clone.length -1;
    int temp;
    heapify(clone, clone.length);
    while (end > 0) {
      temp = clone[end];
      clone[end] = clone[0];
      clone[0] = temp;
      end--;
      siftDown(clone, 0, end);
    }
    return clone;
  }

  public static int Parent(int i) {
    return (i - 1) / 2;
  }

  public static int LeftChild(int i) {
    return 2 * i + 1;
  }

  public static int[] heapify(int[] list, int length){
    int start = Parent(length-1);
    while (start >= 0) {
      siftDown(list, start, length -1);
      start--;
    }
    return list;
  }

  public static void siftDown(int[] list, int start, int end){
    int root = start;
    int temp;
    while (LeftChild(root) <= end) {
      int child = LeftChild(root);
      int swap = root;
      if (list[swap] < list[child]) {
        swap = child;
      }
      if ((child + 1) <= end && (list[swap] < list[child + 1])) {
        swap = child + 1;
      }
      if (swap == root) {
        return;
      }
      else {
        temp = list[root];
        list[root] = list[swap];
        list[swap] = temp;
        root = swap;
      }
    }
  }

}