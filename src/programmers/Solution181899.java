package programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181899
// 카운트다운
public class Solution181899 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num +1];
        for (int i = 0; i < answer.length; i++, start--) {
            answer[i] = start;
        }
        return answer;
    }
}
