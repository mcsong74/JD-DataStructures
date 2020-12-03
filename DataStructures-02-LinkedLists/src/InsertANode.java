public class InsertANode {
    public static void main(String[] args) {
        var myLink= new MyLinkedList();
        myLink.addLast(1);
        myLink.addLast(2);
        myLink.addLast(5);
        myLink.addLast(6);
        myLink.addLast(7);

        myLink.printLinkedList();

        myLink.addInAscOrder(4);
        System.out.println("");
        myLink.printLinkedList();
        System.out.println("myLink.size = " + myLink.size);


    }
}
