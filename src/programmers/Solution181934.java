package programmers;
// 조건 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181934
public class Solution181934 {
    public int solution(String ineq, String eq, int n, int m) {
        // ineq ->  < , >
        // eq   ->  = , !
        int answer = 0 ;
        if (eq.equals("!") && ineq.equals("<")){
            answer = n < m ? 1 : 0;
        } else if (eq.equals("!") && ineq.equals(">")) {
            answer = n > m ? 1 : 0;
        } else if (eq.equals("=") && ineq.equals("<")) {
            answer = n <= m ? 1 : 0;
        } else{
            answer = n >= m ? 1 : 0;
        }
        return answer;
    }
}
