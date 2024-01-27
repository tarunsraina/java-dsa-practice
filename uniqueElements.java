public class uniqueElements {

    public static int findUniqueElements(int[] arr) {

        int uniqueElementPosition = 0;

        for (int j = 0; j <= arr.length - 1; j++) {

            if (arr[uniqueElementPosition] != arr[j]) {

                uniqueElementPosition++;
                arr[uniqueElementPosition] = arr[j];

            }
        }

        return uniqueElementPosition + 1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7 };
        int count = findUniqueElements(arr);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
