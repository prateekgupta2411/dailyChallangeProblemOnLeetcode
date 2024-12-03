package december_2024_dailyPOTD;
// 2109. Adding Spaces to a String
public class Day3_2109 {
    public static String addSpaces(String s, int[] spaces) {
        // Simple Approach Time complexity - O(M*N)
//        StringBuilder ans = new StringBuilder(s);
//        int spaceCounter = 0;
//        for(int spaceIndex : spaces){ // M
//            ans.insert(spaceIndex + spaceCounter, " ");// N
//            spaceCounter++;
//        }
//        return ans.toString();
//    }

    // Using Two Pointer Time Complexity O(M+N)
    int n = s.length();
    int m = spaces.length;
    StringBuilder ans = new StringBuilder(n+m);
    int spaceIndex = 0;
    for (int stringIndex = 0; stringIndex < n; stringIndex++) {
        if (spaceIndex < m && spaces[spaceIndex] == stringIndex) {
            ans.append(' ');
            spaceIndex++;
        }
        ans.append(s.charAt(stringIndex));
    }
    return ans.toString();
}
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int spaces[]  = {8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
}