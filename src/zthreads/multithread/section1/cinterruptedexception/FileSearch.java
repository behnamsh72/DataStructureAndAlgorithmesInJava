package zthreads.multithread.section1.cinterruptedexception;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileSearch implements Runnable {

    /**
     * Initial path for the search
     */
    private final String initPath;

    /**
     * Name of the file we are searching for
     */
    private final String fileName;


    /**
     * Constructor of the class
     *
     * @param initPath
     * @param fileName
     */

    public FileSearch(String initPath, String fileName) {
        this.initPath = initPath;
        this.fileName = fileName;
    }

    public static void main(String[] args) {
        //Creates the Runnable object and the Thread to run it
        FileSearch searcher = new FileSearch("/home/behnam/Darsi/", "BehnamShahabadi.pdf");
        Thread thread = new Thread(searcher);

        thread.start();

        //Wait for 10 seconds
        try {
            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException e) {
            System.out.println("Fuck Time sleep interrupted");
            e.printStackTrace();
        }
        System.out.println("Before  interrupted");
        thread.interrupt();
    }

    @Override
    public void run() {
        File file = new File(initPath);
        if (file.isDirectory()) {
            try {
//                TimeUnit.SECONDS.sleep(1);
                directoryProcess(file);
            } catch (InterruptedException e) {
                System.out.printf("%s : The search has been interrupted", Thread.currentThread().getName());
                cleanResources();
            }
        }
    }

    /**
     * Method for cleaning the Resources. In this case, is empty
     */
    private void cleanResources() {

    }

    /**
     * Method that process a directory
     *
     * @param file :
     *             Directory to process
     * @throws InterruptedException: If the thread is interrupted
     */
    private void directoryProcess(File file) throws InterruptedException {
        File[] list = file.listFiles();
        if (list != null) {
            for (int i = 0; i < list.length; i++) {
                //If is a directory, process it
                if (list[i].isDirectory())
                    directoryProcess(list[i]);
                else {
                    fileProcess(list[i]);
                }
            }
        }
        //Check the interruption
        if (Thread.interrupted()) {
            System.out.println("FUuuck");
            throw new InterruptedException();
        }
    }

    /**
     * Method that process a file
     *
     * @param file
     * @throws InterruptedException
     */
    private void fileProcess(File file) throws InterruptedException {
        //Check the name
        if (file.getName().equals(fileName)) {

            System.out.printf("%s : %s \n", Thread.currentThread().getName(), file.getAbsolutePath());
        }
        if (Thread.interrupted()) {
            System.out.println("FUck");
            throw new InterruptedException();
        }
    }
}
