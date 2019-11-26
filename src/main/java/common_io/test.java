package common_io;

import org.apache.commons.io.CopyUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class test {
    public static void main(String[] args) {
        try {
            //工具类
            UtilityExample.runExample();
            //文件监控
            FileMonitorExample.runExample();
            //fiters过滤
            FiltersExample.runExample();
            //输入
            InputExample.runExample();
            //输出
            OutputExample.runExample();

            ComparatorExample.runExample();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
