package first2last.N4.N412FizzBuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();

        for (int i = 1; i <= n; i++){
            boolean addFizz = (i % 3 == 0);
            boolean addBuzz = (i % 5 == 0);

            String number = "";

            if (addFizz) number = number + "Fizz";
            if (addBuzz) number = number + "Buzz";

            if (number.equals("")) number = Integer.toString(i);

            ans.add(number);
        }
        return ans;
    }
}
