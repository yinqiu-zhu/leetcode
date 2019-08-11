package ch3_QueueAndStack.KeysAndRooms_19;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

  Set<Integer> visited = new HashSet<>();
  List<List<Integer>> rooms;

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {

    if (rooms == null || rooms.isEmpty()) return true;

    boolean res = false;
    this.rooms = rooms;

    dfs(0);

    return rooms.size() == visited.size();
  }

  public void dfs (int room){

    if ( !visited.contains(room) ){
      visited.add(room);
      List<Integer> keys = rooms.get(room);
      for (int i : keys){
        dfs(i);
      }
    }
  }
}