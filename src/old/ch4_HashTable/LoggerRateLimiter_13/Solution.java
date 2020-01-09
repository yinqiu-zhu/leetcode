package old.ch4_HashTable.LoggerRateLimiter_13;

import java.util.HashMap;
import java.util.Map;

class Logger {

  /** Initialize your data structure here. */
  int timestamp;
  String str;
  Map<String, Integer> map = new HashMap<>();

  public Logger() {

  }

  /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
   If this method returns false, the message will not be printed.
   The timestamp is in seconds granularity. */
  public boolean shouldPrintMessage(int timestamp, String message) {
    int time =timestamp;
    if (map.containsKey(message) && timestamp - map.get(message) < 10){
        return false;
      }
    map.put(message, timestamp);
    return true;
  }

  public static void main(String[] args) {
    Logger test = new Logger();
    if (test.shouldPrintMessage(1,"foo"))
      System.out.println(1);
  }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */