package lesson22;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\1317406\\Downloads\\Telegram Desktop");
        File[] files = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                if (pathname.getName().endsWith(".png") ||
                        pathname.getName().endsWith(".jpg") ||
                        pathname.getName().endsWith(".swg")) {
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            System.out.println(f.getAbsolutePath());


        }
    }
}
