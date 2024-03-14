import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line).append(System.lineSeparator());
                line = reader.readLine();
            }
            String content = stringBuilder.toString();
            reader.close();
            content = content.replaceAll("Nha Trang", "Vũng Tàu");
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(content);
            writer.close();
            System.out.println("Thay thế và ghi nội dung vào file output.txt thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi thực hiện thao tác với file");
        }
    }
}
