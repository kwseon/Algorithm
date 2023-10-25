class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String arr[] = my_string.split("");  
        //my_string 한 글자씩 나눠서 String 배열에 담아줌
			
        for(int i = 0; i < arr.length; i++){
            if(!letter.equals(arr[i])) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}