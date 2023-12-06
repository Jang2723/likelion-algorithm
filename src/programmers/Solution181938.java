package programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181938
// 두 수의 연산값 비교하기
public class Solution181938 {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int AB = Integer.parseInt(ab);
        if(AB > 2*a*b) return AB;
        else if (AB < 2 * a*b) return 2 * a*b;
        else return AB;

//        String leftResultStr = "" + a + b;
//        int rightResult = 2* a*b;
//        int leftResult = Integer.parseInt(leftResultStr);
//        return leftResult > rightResult ? leftResult : rightResult;
    }
}
