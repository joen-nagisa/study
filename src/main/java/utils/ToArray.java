package utils;

public class ToArray {
    public static void main(String[] args) {
        Test test = new Test();
//        test.array2Integer(new int[]{1, 2, 3});
//        test.Int2Array(455);
        test.reverseInteger(1234);
    }

    static class Test {
        int[] arr;

        /**
         * 数组转整数
         *
         * @param arr 要转的数组  如 1，2,3
         */
        public void array2Integer(int[] arr) {
            int sum = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                sum = (int) (arr[i] * Math.pow(10, i) + sum);
            }
            System.out.println(sum);
        }

        /**
         * 整数转数组
         *
         * @param integer
         */
        public void Int2Array(Integer integer) {
            String str = String.valueOf(integer);
            int[] tmp = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                tmp[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            for (int entry : tmp) {
                System.out.println(entry);
            }
        }

        /**
         * 倒置一个数字   如123 》321
         * @param number
         */
        public void reverseInteger(int number) {
            // write your code here
            //先把整数转成数组
            String str = String.valueOf(number);
            int [] tmp = new int [str.length()];
            for(int i=0;i<str.length();i++){
                tmp[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
//            int [] result = new int [str.length()];
//            //把数组换位子
//            for(int i=0;i<tmp.length;i++){
//                result[tmp.length-1-i]=tmp[i];
//            }
            //把处理后的数组转成整数
            int num = 0;
            for(int i=tmp.length-1;i>=0;i--){
                num = (int)(tmp[i]*Math.pow(10,i)+num);
            }
            System.out.println(num);
        }
    }
}
