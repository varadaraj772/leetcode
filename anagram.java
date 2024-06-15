public class anagram {

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] countOfChar = new int[26];
    for (int i = 0; i < s.length(); i++) {
      countOfChar[s.charAt(i) - 'a']++;
      countOfChar[t.charAt(i) - 'a']--;
    }
    for (int n : countOfChar) if (n != 0) return false;
    return true;
  }

  public static void main(String args[]) {
    String s = "racecar";
    String t = "carrace";
    System.out.print(isAnagram(s, t));
  }
}
