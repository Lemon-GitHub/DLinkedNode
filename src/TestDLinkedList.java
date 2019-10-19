public class TestDLinkedList {
    public static void main(String[] args) {
        //testAddFirst();
        //testAddLast();
        //testAddIndex();
        //testContains();
        //testRemove();
        //testRemoveAllKey();
        testClear();
    }

    public static void testAddFirst(){
        System.out.println("测试双向链表头插");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addFirst(1);
        dLinkedList.addFirst(2);
        dLinkedList.addFirst(3);
        dLinkedList.addFirst(4);

        dLinkedList.display();
    }

    public static void testAddLast(){
        System.out.println("测试双向链表的尾插");
        DLinkedList dLinkedlist = new DLinkedList();
        dLinkedlist.addLast(1);
        dLinkedlist.addLast(2);
        dLinkedlist.addLast(3);
        dLinkedlist.addLast(5);

        dLinkedlist.display();
    }

    public static void testAddIndex(){
        System.out.println("测试双向链表的指定位置插入");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addIndex(0,0);
        dLinkedList.addIndex(2,200);
        dLinkedList.addIndex(6,100);
        dLinkedList.display();
    }

    public static void testContains(){
        System.out.println("测试双向链表是否包含某一元素");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);

        System.out.println(dLinkedList.contains(1));
        System.out.println(dLinkedList.contains(3));
        System.out.println(dLinkedList.contains(4));
        System.out.println(dLinkedList.contains(100));
    }

    public static void testRemove(){
        System.out.println("测试双向链表删除某一元素");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(1);
        dLinkedList.addLast(4);

        dLinkedList.remove(1);
        dLinkedList.display();
    }

    public static void testRemoveAllKey(){
        System.out.println("测试双向链表删除所有值为key的节点");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(1);
        dLinkedList.addLast(4);

        dLinkedList.removeAllKey(1);
        dLinkedList.display();
    }

    public static void testClear(){
        System.out.println("测试清除链表");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(1);
        dLinkedList.addLast(4);

        dLinkedList.display();

        dLinkedList.clear();
        dLinkedList.display();
    }
}
