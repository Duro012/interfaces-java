
public class Main {

    public static void main(String[] args) {
        Computer dell = new Computer(new Ram(), new Processor(), new Storage());
        System.out.println(dell);

    }
}