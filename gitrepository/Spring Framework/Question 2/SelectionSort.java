package SpringQuestions;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SelectionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] a) {
        System.out.println("\nSelection Sort");
        int size = a.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {
                if (a[i] < a[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = a[step];
            a[step] = a[min_idx];
            a[min_idx] = temp;
        }
        return a;
    }
}
