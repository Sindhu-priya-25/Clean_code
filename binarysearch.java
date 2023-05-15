

 public class binarysearch {
    private int[] arr;

    public binarysearch(int[] arr) {
        this.arr = arr;
    }

    public int searching(int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20,30, 40, 50, 60};
        binarysearch bs = new binarysearch(arr);
        int key = 20;
        int res = bs.searching(key);

        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + res);
        }
    }
}
