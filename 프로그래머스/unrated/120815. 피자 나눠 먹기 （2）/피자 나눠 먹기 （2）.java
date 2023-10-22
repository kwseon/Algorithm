class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < 100; i++) {  //최소 한 판
          if( (6 * i) % n == 0 ) {   // 6*i개의 조각을 n명으로 나눴을때 나머지가 0이어야 함
            answer = i;
            break;
          }
        }
        
        
        return answer;
    }
}