import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        //배열의 크기는 고정, list의 크기는 동적
        List<Integer> list = new ArrayList<>();
        
        for(int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }
        
        //String 타입의 list는 toArray 사용해서 배열 변환 가능
        //int 같은 primitive 타입은 불가
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        //리스트를 스트림으로 변환 후 map을 이용해서 intStream을 가져오고, 그 후에 toArray를 통해 배열로 만듦
        
        //mapToInt(i -> i)
        //자바가 자동으로 각 요소의 Integer 요소를 int형으로 unboxing 해줌
        
        //mapToInt(Integer::intValue) 
        //intValue 메서드를 통해 각 요소를 int형으로 변경
        
        
        //다른 풀이 1
        // int[] answer = new int[list.size()];
        // for(int i = 0; i < list.size(); i++) {
        //    answer[i] = list.get(i);
        // }
        
        //다른 풀이 2
        //return Arrays.copyOfRange(numbers, num1, num2 + 1);
        // Arrays.copyOf( 복사할 배열, 복사할 배열의 크기);
        // Arrays.copyOfRange(복사하고자하는 배열, 시작 위치, 종료 위치);
        // 종료 위치 -1 까지 복사됨. :: from <= range < to
        
        return answer;
    }
}