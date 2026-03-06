package Arrays.Basics;

public class MajorityEx {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int Maxcount = 0;
        int arrElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > Maxcount) {
                Maxcount = count;
                arrElement = arr[i];
            }
        }
        System.out.println("The number " + arrElement + " appeared " + Maxcount + " times");
    }
}
