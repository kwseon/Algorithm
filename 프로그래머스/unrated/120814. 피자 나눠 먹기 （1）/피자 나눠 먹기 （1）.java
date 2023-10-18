class Solution {
    public int solution(int n) {
        
        int a = n / 7;
        int b = 0;
        if(n % 7 > 0) {
            b = 1;
        }
        int answer = a + b;
        return answer;
    }
}