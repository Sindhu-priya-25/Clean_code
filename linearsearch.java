
public class linearsearch
 {
    private int[] arr;

    public linearsearch(int[] arr)
    {
        this.arr = arr;
     }

    public int searching(int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
       {
            if (arr[i] == key)
          {
                return i;   // key is found
            }
        }
        return -1;  // key not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        linearsearch ls = new linearsearch(arr);
        int key = 30;
        int pos = ls.searching(key);
        if (pos == -1)
       {
            System.out.println("key not found");
        } 
        else 
       {
            System.out.println("key found at position " +  pos);
        }
    }
              }
