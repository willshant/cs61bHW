public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
    int sum;
    for(int i=0;i<a.length;i++){
        if(a[i] < 0)
            continue;
        sum = 0;
        for(int j=0;i+j<6;j++){
            sum += a[i+j];
            if(j == 3)
                break;
        }
        a[i] = sum;
    }
}

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}