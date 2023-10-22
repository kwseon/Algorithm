class Solution {
    public String solution(String my_string) {

        StringBuilder a = new StringBuilder(my_string);
        String answer = a.reverse().toString();
        
        return answer;
        //StringBuilder 혹은 StringBuffer 둘 다 가능
    }
}