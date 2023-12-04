package programmers;
/*두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을
return 하는 solution 함수를 작성해 주세요.*/
public class Solution181931 {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;
            // boolean의 크기만큼 등차수열 배열 생성
            int[] arr = new int[included.length];
            arr[0] = a;
            for(int i = 1; i< arr.length; i++){
                arr[i] += a + d * i; // 등차수열 배열 값 입력
            }

            // true 값만 골라서 더하기
            for(int i = 0; i< arr.length; i++){
                if(included[i]){
                    answer += arr[i];
                }
            }
            return answer;
        }

}
