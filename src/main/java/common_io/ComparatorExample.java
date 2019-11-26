package common_io;

import java.io.File;
import java.util.Comparator;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.comparator.SizeFileComparator;

//        NameFileComparator: 文件名的比较器，可以进行文件名称排序；
//        SizeFileComparator: 按照文件大小比较
//        LastModifiedFileComparator: 根据最新修改日期比较
public final class ComparatorExample {

    private static final String PARENT_DIR =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder";

    private static final String FILE_1 =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\example";

    private static final String FILE_2 =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\exampleTxt.txt";

    public static void runExample() {
        System.out.println("Comparator example...");

        //NameFileComparator

        // Let's get a directory as a File object
        // and sort all its files.
        File parentDir = FileUtils.getFile(PARENT_DIR);
        NameFileComparator comparator = new NameFileComparator(IOCase.SENSITIVE);
        File[] sortedFiles = comparator.sort(parentDir.listFiles());

        System.out.println("Sorted by name files in parent directory: ");
        for (File file: sortedFiles) {
            System.out.println("\t"+ file.getAbsolutePath());
        }


        // SizeFileComparator

        // We can compare files based on their size.
        // The boolean in the constructor is about the directories.
        //      true: directory's contents count to the size.
        //      false: directory is considered zero size.
        SizeFileComparator sizeComparator = new SizeFileComparator(true);
        File[] sizeFiles = sizeComparator.sort(parentDir.listFiles());

        System.out.println("Sorted by size files in parent directory: ");
        for (File file: sizeFiles) {
            System.out.println("\t"+ file.getName() + " with size (kb): " + file.length());
        }


        // LastModifiedFileComparator

        // We can use this class to find which file was more recently modified.
        LastModifiedFileComparator lastModified = new LastModifiedFileComparator();
        File[] lastModifiedFiles = lastModified.sort(parentDir.listFiles());

        System.out.println("Sorted by last modified files in parent directory: ");
        for (File file: lastModifiedFiles) {
            Date modified = new Date(file.lastModified());
            System.out.println("\t"+ file.getName() + " last modified on: " + modified);
        }

        // Or, we can also compare 2 specific files and find which one was last modified.
        //      returns > 0 if the first file was last modified.
        //      returns  0)
//        System.out.println("File " + file1.getName() + " was modified last because...");
//        else
//        System.out.println("File " + file2.getName() + "was modified last because...");
//
//        System.out.println("\t"+ file1.getName() + " last modified on: " +
//                new Date(file1.lastModified()));
//        System.out.println("\t"+ file2.getName() + " last modified on: " +
//                new Date(file2.lastModified()));
    }
}


//输出如下
//Comparator example...
//        Sorted by name files in parent directory:
//        C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\comparator1.txt
//        C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\comperator2.txt
//        C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\example
//        C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\exampleFileEntry.txt
//        C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\exampleTxt.txt
//        Sorted by size files in parent directory:
//        example with size (kb): 0
//        exampleTxt.txt with size (kb): 87
//        exampleFileEntry.txt with size (kb): 503
//        comperator2.txt with size (kb): 1458
//        comparator1.txt with size (kb): 4436
//        Sorted by last modified files in parent directory:
//        exampleTxt.txt last modified on: Sun Oct 26 14:02:22 EET 2014
//        example last modified on: Sun Oct 26 23:42:55 EET 2014
//        comparator1.txt last modified on: Tue Oct 28 14:48:28 EET 2014
//        comperator2.txt last modified on: Tue Oct 28 14:48:52 EET 2014
//        exampleFileEntry.txt last modified on: Tue Oct 28 14:53:50 EET 2014
//        File example was modified last because...
//        example last modified on: Sun Oct 26 23:42:55 EET 2014
//        exampleTxt.txt last modified on: Sun Oct 26 14:02:22 EET 2014