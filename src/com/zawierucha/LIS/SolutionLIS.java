package pl.zawierucha.LIS;

public class SolutionLIS {

    public static int solution(String S) {
        return S.length() - LIS(S, 0, Integer.MIN_VALUE);
    }

    private static int LIS(String S, int i, int prev) {
        // Base case: nothing is remaining;
        // starting index = len of string
        if (i == S.length()) {
            return 0;
        }

        // case 1: exclude the current element and process the
        // remaining elements;
        // we start with the next letter
        int excl = LIS(S, i + 1, prev);

        // case 2: include the current element if it is greater
        // than previous element in LIS;
        // if the letter is bigger
        int incl = 0;
        if (S.charAt(i) >= prev) {
            incl = 1 + LIS(S, i+1, S.charAt(i));
        }

        return Integer.max(incl, excl);
    }

    public static void main(String[] args)
    {
        String A = "banana";
        System.out.print("Length of LIS is " + solution(A));
    }
}
