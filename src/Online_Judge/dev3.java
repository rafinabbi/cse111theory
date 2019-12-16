package Online_Judge;

import java.util.*;

public class dev3 {
    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int test=s.nextInt();
        int a,b,c;
        for (int i = 0; i <test ; i++) {
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            int sum1[]= new int[3];
            int sum2[]= new int[3];
            int sum3[]= new int[3];
            int arr1[] = { a, a-1, a+1};
            int arr2[] = { b, b-1, b+1};
            int arr3[] = { c, c-1, c+1};
            //int a[]
            for(int j= 0; j <3; j++){
                for (int k = 0; k <3 ; k++) {
                    if(j==0) sum1[k]=Math.abs(arr1[j]-arr2[k]);
                    if(j==1) sum2[k]=Math.abs(arr2[j]-arr3[k]);
                    if(j==2) sum3[k]=Math.abs(arr3[j]-arr1[k]);
                }
                //System.out.println();
                //int absof=getMinValue(sum1)+getMinValue(sum2)+getMinValue(sum3);

            }
            //for (int j = 0; j <sum1.length ; j++) {
                //System.out.println(sum1[j]);
            //}
            int d=(getMinValue(sum1)-1);
            int d1=(getMinValue(sum2)-1);
            int d2=(getMinValue(sum3)-1);
            System.out.println(d+" "+d1+" "+d2);
            if(d<0) d=0;
            if(d1<0) d1=0;
            if(d2<0)  d2=0;
            System.out.println(d+d1+d2);
        }
    }
}
