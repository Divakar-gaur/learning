package array;

import java.util.Arrays;

public class SumOfTwoUnequalArrays {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4,5,6,7,8};
        int n=b.length;
        if(a.length<b.length) n=a.length;

        for (int i=0;i<n;i++){
            if(a.length>b.length) a[i]=a[i]+b[i];
            else b[i]=b[i]+a[i];
        }

        String res=a.length>b.length ? Arrays.toString(a) : Arrays.toString(b);
        System.out.println(res);
    }
}
