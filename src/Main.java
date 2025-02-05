import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders found: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files found: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\SubPastaTeste").mkdir();
        System.out.println("Directory created: " + success);

        System.out.println("Enter a file path: ");
        String strFilePath = sc.nextLine();

        File pathFile = new File(strFilePath);

        System.out.println("GetName: " + pathFile.getName());
        System.out.println("GetParent: " + pathFile.getParent());
        System.out.println("GetPath: " + pathFile.getPath());

        sc.close();
    }
}