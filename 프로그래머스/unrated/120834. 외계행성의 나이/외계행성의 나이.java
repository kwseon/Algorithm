import java.util.stream.Stream;
class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        
        int[] arr2 = Stream.of(Integer.toString(age).split("")).mapToInt(Integer::parseInt).toArray();
        //mapToInt(Integer::parseInt)  :  String을 int로 변환
        //mapToInt(i -> i) & mapToInt(Integer::intValue)  :  Integer를 int로 변환
        
        for(int i = 0; i <arr2.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(arr2[i] == j) {
                    answer += arr[j];
                }
            }
        }
        return answer;
    }
}