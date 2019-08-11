package ch4_HashTable.UniqueWordAbbreviation_23;


import java.util.HashMap;
import java.util.Map;

class ValidWordAbbr {

  Map<String, String> dict;

  public ValidWordAbbr(String[] dictionary) {

     dict = new HashMap<>();
    for (String str : dictionary){
      int num = str.length();
      if (num <= 2) dict.put(str,"#");
      else {
        String abbr = "" + str.charAt(0) + (num - 2) + str.charAt(num - 1);
        if (dict.containsKey(abbr))
          dict.put(abbr,"#");
        else dict.put(abbr,str);
      }
    }
  }

  public boolean isUnique(String word) {
    int num  = word.length();
    if (num <= 2) return true;
    String abbr = "" + word.charAt(0) + (num - 2)  + word.charAt(num - 1);
    return !dict.containsKey(abbr) || dict.get(abbr).equals( word);
  }

  public static void main(String[] args) {
    {
      ValidWordAbbr one = new ValidWordAbbr(new String[] {"deer","door","cake","card"});
    one.isUnique("dear");
    System.out.println(one.isUnique("cart"));
      System.out.println(one.isUnique("cake"));
    }
    {
      ValidWordAbbr two = new ValidWordAbbr(new String[]{"hello"});
      System.out.println(two.isUnique("hello"));
    }
    {
      ValidWordAbbr two = new ValidWordAbbr(new String[]{"one"});
      System.out.println(two.isUnique("one"));
    }
  }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */