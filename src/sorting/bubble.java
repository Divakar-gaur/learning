package sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int [] a= {7,8,2,5,0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int [] a){
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
