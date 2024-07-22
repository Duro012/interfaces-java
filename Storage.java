
public class Storage {
    String type = "SSD";

    String manufacturer = "Samsung";

    int size = 512;

    @Override
    public String toString() {
        return "type=" + type +
                ", manufacturer=" + manufacturer +
                ", capacity=" + size +
                "}";
    }
}