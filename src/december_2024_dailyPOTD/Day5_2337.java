package december_2024_dailyPOTD;

public class Day5_2337 {
    public static boolean canChange(String start, String target) {
        int i =0;
        int j = 0;
        int n = start.length();
        while(i<n || j <n){
            // skip all blank on start
            while(i<n && start.charAt(i)=='_') i++;

            //skip all blank on target
            while(j<n && target.charAt(j) =='_') j++;

            if(i==n || j==n){
                return (i==n && j==n);
            }

            //check false scenarios
            if(start.charAt(i)!=target.charAt(j) ||
                    (start.charAt(i)=='L' && j>i) ||
                    (start.charAt(i) == 'R' && j<i)
            ){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        String start = "_L__R__R_"; String  target = "L______RR";
        System.out.println(canChange(start,target));
    }
}
