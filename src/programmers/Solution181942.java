package programmers;
//프로그래머스 - 문자열 섞기 - 문제 설명
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
// 한 번씩 등장하는 문자열을 만들어
// return 하는 solution 함수를 완성해 주세요.
public class Solution181942 {
    public String solution(String str1, String str2) {
        // 주석으로 어떤 과정을 통해 문제를 풀지 작성해보기
        String answer = "";
        /*
        // string.toCahrArray()
        // 문자열을 구성하는 char의 배열을 반환하는 메서드
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // 1. str1의 길이만큼 반복한다.
        for (int i = 0; i < str1.length(); i++) {
            // 2. str1의 i번째 글자를 answer에 덧붙인다.
            answer += chars1[i];
            // 3. str2의 i번째 글자를 answer에 덧붙인다.
            answer += chars2[i];
        }
        */

        /*
        // string.charAt(int index)
        // 문자열을 구성하는 char들 중 i번쨰를 반환하는 메서드
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
         */

        // StringBuilder로 답을 작성하기
        StringBuilder lineBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            // 정답 문자열에 뒤에 붙이고 싶은 데이터를
            // append 메서드로 전달
            lineBuilder.append(str1.charAt(i));
            lineBuilder.append(str2.charAt(i));
        }
        answer = lineBuilder.toString();

        // 4. 결과를 반환한다.
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution181942().solution("aaaaa","bbbbb"));
    }
}
