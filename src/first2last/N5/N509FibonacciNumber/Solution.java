package first2last.N5.N509FibonacciNumber;

class Solution {

  private int fib(int N) {
    if (N < 2) return N;
    int[] cache = new int[31];
    cache[0] = 0;
    cache[1] = 1;

    for (int i = 2; i <= N; i++){
    cache[i] = cache[i-1] + cache[i-2];
    }

    return cache[N];
  }
}