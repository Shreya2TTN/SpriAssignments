package SpringQuestions;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgo {
    @Override
    public int[] sort(int[] a) {
        System.out.println("\nBubble Sort");
        int size = a.length;
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        return a;

    }
}
