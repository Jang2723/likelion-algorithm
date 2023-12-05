package programmers;
/*정수가 담긴 리스트 num_list가 주어질 때,
모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
https://school.programmers.co.kr/learn/courses/30/lessons/181929
*/
public class Solution181929 {
        public int solution(int[] num_list) {
            int answer = 0;
            int multi = 1; // 모든 원소들의 곱
            int sum =0; // 모든 원소들의 합의 제곱
            for(int i=0; i< num_list.length; i++){
                multi *= num_list[i];
            }

            for(int i=0; i< num_list.length; i++){
                sum += num_list[i];
            }
            sum *= sum; // 합의 제곱
            if (multi < sum) answer =1;
            else answer =0;
            return answer;
        }

}
