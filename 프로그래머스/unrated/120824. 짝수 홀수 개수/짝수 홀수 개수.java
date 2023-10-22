class Solution {
    public int[] solution(int[] num_list) {

	int a = 0;
	int b = 0;
	
	for(int i = 0; i < num_list.length; i++) {
		if(num_list[i] % 2 == 0) {
			a++;
		}else {
			b++;
		}
	};
        
        return new int[]{a, b};
        //배열의 선언과 생성 분리하면 안됨!
        //int[] answer = new int[2] 배열 선언 후 return answer = {a, b} => 오류
    }
}