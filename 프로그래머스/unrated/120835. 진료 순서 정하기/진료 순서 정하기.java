import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        
        int[] answer = new int[length];
        
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder()); // 내림차순해서 비교
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++) {
                if(arr[j] == emergency[i]) {
                    answer[i] = j + 1;
                }
            }
        }
        
        return answer;
    }
}