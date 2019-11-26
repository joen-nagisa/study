package utils;

import common_io.test;

public class CommonUtils {
    public static void main(String[] args) {
        run();
    }


    /**
     * 判断字符串是否为空，是的话返回空字符串。
     * 必须先判断obj==null isEmpty其实就是str.length()==0，如果是null，没有分配空间会报空指针异常。
     */
    public static String IsStringNull(String  obj){
        String str="";
        //判断为空
        if(obj==null||obj.isEmpty()){
            return str;
        }
        else if("null".equals(obj)){
            return str;
        }else {
            return obj;
        }
    }
    private static void run() {
        String str =String.format("good %.2f %s for you",10.01f,"~good");
        System.out.printf(str);
    }
}
