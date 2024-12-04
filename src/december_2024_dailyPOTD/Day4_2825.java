package december_2024_dailyPOTD;
// 2825. Make String a Subsequence Using Cyclic Increments
public class Day4_2825 { // TC -> O Min(n,m)
    public static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        int n = str1.length();
        int m = str2.length();
        while(i<n && j < m){
            if((str1.charAt(i) == str2.charAt(j)) ||
                    (str1.charAt(i) == str2.charAt(j) - 1) ||
                    (str1.charAt(i) == 'z' && str2.charAt(j) == 'a')){
                j++;
            }
            i++;
        }
        return (j == m);
    }
    public static void main(String[] args) {
        String str1 = "zc";
        String str2 = "am";
        System.out.println(canMakeSubsequence(str1,str2));
    }
}
