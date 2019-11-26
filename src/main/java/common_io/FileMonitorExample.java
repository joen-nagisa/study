package common_io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileDeleteStrategy;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.io.monitor.FileEntry;

/**
 *      可以允许我们创建跟踪文件或目录变化的监听句柄，当文件目录等发生任何变化，都可以用“观察者”的身份进行观察，
 *  其步骤如下：
 *    1） 创建要监听的文件对象
 *    2） 创建FileAlterationObserver 监听对象，在上面的例子中，
 *    File parentDir = FileUtils.getFile(PARENT_DIR);
 *   FileAlterationObserver observer = new FileAlterationObserver(parentDir);
 *    创建的是监视parentDir目录的变化，
 *    3） 为观察器创建FileAlterationListenerAdaptor的内部匿名类，增加对文件及目录的增加删除的监听
 *    4） 创建FileAlterationMonitor监听类，每隔500ms监听目录下的变化，其中开启监视是用monitor的start方法即可。
 */
public final class FileMonitorExample {

    private static final String EXAMPLE_PATH =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\exampleFileEntry.txt";
    private static final String PARENT_DIR =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder";
    private static final String NEW_DIR =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\newDir";
    private static final String NEW_FILE =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\newFile.txt";
    public static void runExample() {
        System.out.println("File Monitor example...");

        // FileEntry

        // We can monitor changes and get information about files
        // using the methods of this class.
        FileEntry entry = new FileEntry(FileUtils.getFile(EXAMPLE_PATH));

        System.out.println("File monitored: " + entry.getFile());
        System.out.println("File name: " + entry.getName());
        System.out.println("Is the file a directory?: " + entry.isDirectory());


        // File Monitoring

        // Create a new observer for the folder and add a listener
        // that will handle the events in a specific directory and take action.
        File parentDir = FileUtils.getFile(PARENT_DIR);

        FileAlterationObserver observer = new FileAlterationObserver(parentDir);
        observer.addListener(new FileAlterationListenerAdaptor() {

            @Override
            public void onFileCreate(File file) {
                System.out.println("File created: " + file.getName());
            }

            @Override
            public void onFileDelete(File file) {
                System.out.println("File deleted: " + file.getName());
            }

            @Override
            public void onDirectoryCreate(File dir) {
                System.out.println("Directory created: " + dir.getName());
            }

            @Override
            public void onDirectoryDelete(File dir) {
                System.out.println("Directory deleted: " + dir.getName());
            }
        });

        // Add a monior that will check for events every x ms,
        // and attach all the different observers that we want.
        FileAlterationMonitor monitor = new FileAlterationMonitor(500, observer);
        try {
            monitor.start();

            // After we attached the monitor, we can create some files and directories
            // and see what happens!
            File newDir = new File(NEW_DIR);
            File newFile = new File(NEW_FILE);

            newDir.mkdirs();
            newFile.createNewFile();

            Thread.sleep(1000);

            FileDeleteStrategy.NORMAL.delete(newDir);
            FileDeleteStrategy.NORMAL.delete(newFile);

            Thread.sleep(1000);

            monitor.stop();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//看到的结果：
//File Monitor example...
//        File monitored: C:\Users\Lilykos\workspace\ApacheCommonsExample\ExampleFolder\exampleFileEntry.txt
//        File name: exampleFileEntry.txt
//        Is the file a directory?: false
//        Directory created: newDir
//        File created: newFile.txt
//        Directory deleted: newDir
//        File deleted: newFile.txt
