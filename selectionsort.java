public class selectionsort {
    private int[] arr;

    public selectionsort(int[] arr) {
        this.arr = arr;
    }

    public void sorting() {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    // printing the sorted array
    
    public void printing() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {32, 45, 49, 23,500};
        

        selectionsort ss = new selectionsort(arr);
        ss.sorting();

        System.out.println("After sorting:");
        ss.printing();
    }
}

