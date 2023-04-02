package SpringQuestions;

public class LooseCoupled {
    public SortingAlgo sortMethod;
    public LooseCoupled(SortingAlgo sortMethod){
        this.sortMethod=sortMethod;
    }

    public int a[]=new int[]{6,5,4,3,2,8};
    public int binarySearch(int num) {
        System.out.println("Array before sorting : ");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
        sortMethod.sort(a);
        System.out.println("\nAfter sorting array ");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
        int lo = 0, hi = a.length - 1;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (a[mid] < num) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (a[lo] == num) {
            return lo;
        } else if (a[hi] == num) {
            return hi;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        LooseCoupled looseCoupled=new LooseCoupled(new BubbleSort());
        int a=looseCoupled.binarySearch(5);
        System.out.println("\nSorted index " +a);
    }
}
