package HW03;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        for (int i = 0; i < 7 ; i++) {
            list.add(i);
        }
        list.print();
        list.revert();
        list.print();
    }
}
