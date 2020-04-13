package utils;

/*冒泡排序*/
public class BubbleSort {
    public static void main(String[] args) {
        int [] number = new int[]{0,7,2,1,3,4,6,8,9,5};
        //第二种创建方法   int [] number = {1,2}   int [] number = new int [5];
        int tem = 0;
        /*10个元素就要比较9次*/
        for (int i=0;i<number.length-1;i++){
            /*每次都从第一个 [0] 开始遍历，把它送到最后去。  还剩下要遍历的元素*/
            for(int j =0;j<number.length-1-i;j++){
                if(number[j]>number[j+1]){
                    tem=number[j+1];
                    number[j+1] = number[j];
                    number[j]=tem;
                }
            }
        }
        for (int entry:number){
            System.out.println(entry);
        }
    }
}
