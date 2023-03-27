import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int k = 0;
        for (int i : source) {
            if (i >= treshold) {
                result.add(i);
                k++;
                logger.log("Число " + i + " подходит");
            } else {
                logger.log("Число " + i + " не подходит");
            }
        }
        logger.log("Количество элементов, прошедших фильтрацию успешно: " + k);
        return result;
    }
}