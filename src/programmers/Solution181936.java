package programmers;
// 공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/181936

public class Solution181936 {
    public int solution(int number, int n, int m) {
        // number가 n의 배수이면서 m의 배수이면 1,아니면 0 return
        if(number % n == 0 && number % m == 0) return 1;
        return 0;
    }
}