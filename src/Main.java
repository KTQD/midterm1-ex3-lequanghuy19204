import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append(System.lineSeparator());
                line = br.readLine();
            }
            String content = sb.toString();
            br.close();
            content = content.replaceAll("Nha Trang", "Vũng Tàu");
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(content);
            bw.close();
            System.out.println("Thay thế và ghi nội dung vào file output.txt thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi thực hiện thao tác với file");
        }
    }
}

}
