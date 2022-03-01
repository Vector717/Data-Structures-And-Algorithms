// package linked_list;



public class Main {
    public static void main(String[] args) {

       LL list = new LL();
       list.insertFirst(8);
       list.insertFirst(32);
       list.insertFirst(5);
       list.insertFirst(92);
       list.insertLast(9);
       list.insertLast(3);
       list.insertLast(87);
       list.insert(22,3);
       list.display();
       System.out.println(list.deleteFirst());
       list.display();
       System.out.println(list.deleteLast());
       list.display();
       System.out.println(list.delete(2));
       list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();
    }
}