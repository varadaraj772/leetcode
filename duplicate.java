//import java.util.*;

import java.util.HashSet;

class duplicate {

  public static void main(String args[]) {
    //Scanner sc = new Scanner(System.in);
    int arr[] = { 1, 6, 2, 0, 0, 4, 3, 4 };
    HashSet<Integer> set = new HashSet<>();
    Boolean found = false;
    for (int i : arr) {
      if (set.contains(i)) {
        found = true;
      }
      set.add(i);
    }
    System.out.print(found);
  }
}
