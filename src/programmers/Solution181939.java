package programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181939
// 두수 합치기
public class Solution181939 {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        int AB = Integer.parseInt(ab);
        int BA = Integer.parseInt(ba);
        if(AB > BA) return AB;
        else if (BA> AB) return BA;
        else return AB;
    }
 }