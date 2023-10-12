class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        
        int answer1 = denom1 * numer2 + numer1 * denom2;
        int answer2 = denom1 * denom2;
        
        int max = 1;
        
        for(int i = 1; i <= answer1 && i <= answer2; i++) {
            if(answer1 % i ==0 && answer2 % i ==0) {
                max = i;
            }
        }
        
        answer1 = answer1 / max;
        answer2 = answer2 / max;
        
        int[] answer = {answer1, answer2};
            
        return answer;
    }
}