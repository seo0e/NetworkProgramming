import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] original = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] copy = null;
        byte[] temp = new byte[4];
        int num;

        ByteArrayInputStream in = new ByteArrayInputStream(original);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.out.println("[Original Data]");
        System.out.println(Arrays.toString(original));
        try {
            while (in.available() > 0) {
                out.write(temp,0, in.read(temp));
                System.out.println("[Temp Data]");
                System.out.println(Arrays.toString(temp));
                copy = out.toByteArray();
                printArrays(temp, copy);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void printArrays(byte[] temp, byte[] copy) {
        System.out.println("[temp Data]");
        System.out.println(Arrays.toString(temp));
        System.out.println("[Copy Data]");
        System.out.println(Arrays.toString(copy));
    }
}