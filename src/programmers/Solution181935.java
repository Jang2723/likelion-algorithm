package programmers;
// 홀짝에 따라 다른 값 반환
// https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class Solution181935 {
    public int solution(int n) {
        int sum = 0;
        // n이 홀수면 n이하의 홀수 합 return
        if (n % 2 == 1) {// 홀수
            for (int i = 0; i <= n; i++) {
                if( i % 2 == 1){
                    sum += i;
                }
            }
        }
        // n이 짝수면 n이하의 짝수 정수의 제곱의 합 return
        else { // n이 짝수
            // 짝수 제곱의 합
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0){
                    sum += i * i;
                }
            }
        }
        return sum;
    }
}
