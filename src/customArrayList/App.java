package customArrayList;

public class App {

    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.remove());
        list.add(70);
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());

    }
}
