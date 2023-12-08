package programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181928
// 이어붙인 수
public class Solution181928 {
    public int solution(int[] num_list) {
        int answer = 0;
        String n = ""; // 홀수
        String m = ""; // 짝수
        for (int i = 0; i < num_list.length; i++) {
            if ( num_list[i] % 2 == 1){
                n += Integer.toString(num_list[i]);
            }
            else{
                m += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(n) + Integer.parseInt(m);
        return answer;
    }
}
