package common_io;

import javafx.scene.Parent;
import org.apache.commons.io.*;

import java.io.File;
import java.io.IOException;

/**
 *      1） FilenameUtils:主要处理各种操作系统下对文件名的操作
 *      2) FileUtils:处理文件的打开，移动，读取和判断文件是否存在
 *      3） IOCASE：字符串的比较
 *      4） FileSystemUtils:返回磁盘的空间大小
 */
public class UtilityExample {
    // We are using the file exampleTxt.txt in the folder ExampleFolder,
    // and we need to provide the full path to the Utility classes.
    private static final String EXAMPLE_TXT_PATH =
            "D:\\soft\\javasoft\\temporary\\ExampleFolder\\exampleTxt.txt";
    private static final String PARENT_DIR =
            "D:\\soft\\javasoft\\temporary";
    public static void runExample() throws IOException {
        System.out.println("Utility Classes example...");


        // FilenameUtils 主要处理各种操作系统下对文件名的操作
        //获取全路径名。   去掉了文件名c:\da\带个\
        System.out.println("Full path of exampleTxt: " +
                FilenameUtils.getFullPath(EXAMPLE_TXT_PATH));
        //获取文件名
        System.out.println("Full name of exampleTxt: " +
                FilenameUtils.getName(EXAMPLE_TXT_PATH));
        //获取文件后缀名，不带点
        System.out.println("Extension of exampleTxt: " +
                FilenameUtils.getExtension(EXAMPLE_TXT_PATH));
        //获取文件名，不带后缀名也不带点
        System.out.println("Base name of exampleTxt: " +
                FilenameUtils.getBaseName(EXAMPLE_TXT_PATH));


        // FileUtils
        //处理文件 文件对象的创建、打开、移动、读取和判断文件是否存在
        // We can create a new File object using FileUtils.getFile(String)
        // and then use this object to get information from the file.
        File exampleFile = FileUtils.getFile(EXAMPLE_TXT_PATH);
        LineIterator iter = FileUtils.lineIterator(exampleFile);

        System.out.println("Contents of exampleTxt...");
        while (iter.hasNext()) {
            System.out.println("\t" + iter.next());
        }
        iter.close();

        //判断文件夹是否有某文件
        // We can check if a file exists somewhere inside a certain directory.
        File parent = FileUtils.getFile(PARENT_DIR);
        System.out.println("Parent directory contains exampleTxt file: " +
                FileUtils.directoryContains(parent, exampleFile));


        // IOCase
        //字符串的比较
        String str1 = "This is a new String.";
        String str2 = "This is another new String, yes!";

        System.out.println("Ends with string (case sensitive): " +
                IOCase.SENSITIVE.checkEndsWith(str1, "string."));
        System.out.println("Ends with string (case insensitive): " +
                IOCase.INSENSITIVE.checkEndsWith(str1, "string."));

        System.out.println("String equality: " +
                IOCase.SENSITIVE.checkEquals(str1, str2));


        // FileSystemUtils
        //返回磁盘空间的大小
        System.out.println("Free disk space (in KB): " + FileSystemUtils.freeSpaceKb("C:"));
        System.out.println("Free disk space (in MB): " + FileSystemUtils.freeSpaceKb("C:") / 1024);
    }

//输出的结果
//    Utility Classes example...
//    Full path of exampleTxt: C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\
//    Full name of exampleTxt: exampleTxt.txt
//    Extension of exampleTxt: txt
//    Base name of exampleTxt: exampleTxt
//    Contents of exampleTxt...
//    This is an example text file.
//    We will use it for experimenting with Apache Commons IO.
//    Parent directory contains exampleTxt file: true
//    Ends with string (case sensitive): false
//    Ends with string (case insensitive): true
//    String equality: false
//    Free disk space (in KB): 32149292
//    Free disk space (in MB): 31395
}
