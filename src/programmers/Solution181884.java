package programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181884
// n보다 커질 떄까지 더하기
public class Solution181884 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(answer > n) return answer; //n보다 커지면 return
            else{
                answer += numbers[i]; // n보다 작으면 계속 더하기
            }
        }
        return answer;
    }
}
