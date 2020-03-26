public class Main {
    public static void main(String[] args) {
        /*GenericArray<String> list = new GenericArray<String>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        for(String str : list.getList()){
            System.out.println(str);
        }
        if(list.exist("cuatro")){
            System.out.println("sipiriri");
        }
        GenericArray<Integer> list2 = new GenericArray<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Integer rta = list2.max();
        if(rta == null){
            System.out.println("esta vacio");
        }else{
            System.out.println("esto es max: "+rta);
        }*/

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);

        s.pop();
        System.out.println(s);

    }
}