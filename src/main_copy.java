import java.util.ArrayList;
import java.util.List;

public class main_copy {
    public static void main(String[] args) {
        System.out.println("Hello World!");


//        ArrayList<String> numbers = new ArrayList<>();
//        numbers.add("153");
//        numbers.add("370");
//        numbers.add("5467");
//
//        for(int i=0; i<numbers.size();i++){
//            String number = numbers.get(i);
//            int total = 0;
//            for (int j=0 ; j<numbers.get(i).length(); j++){
//                total += Character.getNumericValue(number.charAt(j)) * Character.getNumericValue(number.charAt(j)) * Character.getNumericValue(number.charAt(j));
//            }
//            if(total == parseInt(number))
//                System.out.println(number);
//        }

        int[] arr = { 1, 2, 3, 4, 5 };

        List<Integer> list = new ArrayList<>(arr.length);

        for (int i : arr) {
            list.add(Integer.valueOf(i));
        }

        List<Integer> result = cellCompete(arr, 1);
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<Integer> cellCompete(int[] states, int days)
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        List<Integer> list = new ArrayList<>(arr.length);

        for (int i : arr) {
            list.add(Integer.valueOf(i));
        }

        System.out.println(list);
        return list;


    }
    // METHOD SIGNATURE ENDS

}
