public class Main {
    public static void main(String[] args) {
        listItem node4 = new listItem(1, null);
        listItem node3 = new listItem(2, node4);
        listItem node2 = new listItem(3, node3);
        listItem node1 = new listItem(4, node2);

        System.out.println(node1.getValue());
        System.out.println(node2.getValue());
        System.out.println(node3.getValue());
        System.out.println(node4.getValue());
    }
}