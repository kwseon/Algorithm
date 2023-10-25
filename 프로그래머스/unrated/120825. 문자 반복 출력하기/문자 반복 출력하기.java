class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] arr = my_string.toCharArray(); //String을 char형 배열로 바꿔줌
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < n; j++) {
				answer += Character.toString(arr[i]);
                //cha를 string으로 변환!
                
                //Arrays.toString으로 해서 오류남
                //Arrays.toString(배열)만 가능
                
                //다른 풀이 1
                //my_string.charAt(i); 를 포문돌려서 더하기
                
                //다른 풀이 2
                //String[] arr = my_string.split(""); 해 준 후,
                //str += arr[i].repeat(n); 를 포문돌려서 더하기
			}
		}

        return answer;
    }
}