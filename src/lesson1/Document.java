package lesson1;

import javax.print.Doc;
import java.util.Objects;

public class Document {

    private static final String DEFAULT_TITLE = "Unknown";

    String title;
    String content;

    public Document(String content) {
        this(DEFAULT_TITLE, content);
    }

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent() {
        this.content = content;
    }

    public void printInfo() {
        System.out.println(title + System.lineSeparator() + content);
    }

//    public static void main(String[] args) {
//        Document doc1 = new Document()
//    }
}
