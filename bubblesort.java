public class bubblesort {
    private int[] arr;

    public bubblesort(int[] arr) {
        this.arr = arr;
    }

    public void sorting() {
        int n = arr.length;
       
        for (int i = 0; i < n - 1; i++) {   //this loop for no of passes
            for (int j = 0; j < n - i - 1; j++) {  //this loop is for comparing adjacent elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];  //swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void displayarr() { //to display the sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {18, 29, 27, 81, 87, 15};
        bubblesort bs = new bubblesort(arr); // creating an object
        bs.sorting();
        bs.displayarr();
    }
}
