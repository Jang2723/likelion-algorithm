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

/*      String resultA = "" + a + b;
        // String resultA = String.format("%d%d", a, b);
        // StringBuilder aBuilder = new StringBuilder();
        // aBuilder.append(a).append(b);
        String resultB = "" + b + a;

        int resultAInt = Integer.parseInt(resultA);
        int resultBInt = Integer.parseInt(resultB);

//        if (resultAInt > resultBInt) {
//            return resultAInt;
//        }
//        else {
//            return resultBInt;
//        }

        return Math.max(resultAInt, resultBInt);
        */
    }

//    public static void main(String[] args) {
//        new Solution181939().solution(12, 3);
//    }
 }