package utils;

public class Test {
    public static void main(String[] args) {
        int a [] = new int [] {1,0,2,4,3};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j] = temp;
                }
            }
        }

        for (int entry:a ){
            System.out.println(entry);
        }
    }
}
