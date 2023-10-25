class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if( n % 2 == 0) {
            for(int i = 0; i <= 500; i++) {
                answer += 2 * i;
                if(n- 2*i == 0) 
                break;
            }
        }else{
            for(int i = 0; i <= 500; i++) { 
                //처음에 i를 1부터 시작하게 했는데 그러면 n = 1일 경우가 계산 안 되므로 틀림!
                answer += 2 * i;
                if(n- 2*i == 1) 
                break;
            }
        }
        
        //다른 풀이
        //for(int i=2; i<=n; i+=2){
        //    answer+=i;
        //}
        return answer;
    }
}