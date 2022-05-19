package lesson22;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils {

    @Override
    public void copy(String from, String to) throws IOException {
        File copied = new File(to);
        File original = new File(from);
    }
}
