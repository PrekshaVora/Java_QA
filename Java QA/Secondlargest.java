public class Secondlargest {

    public static int getSecondLargest(int[] a, int total){
        int temp;
        for(int i=0;i< total;i++){
            for(int j= i+1; j<total; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
        
    }
    public static void main(String[] args) {
        int a[] = {1,2,5,6,3,2};
        int b[] = {55,78,89,99,120,65,90};
        System.out.println("Second largest:" + getSecondLargest(a,6));
        System.out.println("Second largest:" + getSecondLargest(b, 7));
    }
}
