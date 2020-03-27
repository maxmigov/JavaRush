import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Самые частые байты
*/

public class FrequentBytesWithMap {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        
        ArrayList<Integer> list = new ArrayList<>();
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
        inputStream.close();
        Collections.sort(list);
        
        Integer[] strArray = list.toArray(new Integer[list.size()]);
        
        Map<Integer, Long> freq = Stream.of(strArray)
                                  .collect(Collectors.groupingBy(
                                   Function.identity(), Collectors.counting()));
                                   
        Long max = 0L;
        for (Map.Entry<Integer, Long> entry : freq.entrySet()) {
            Long value = entry.getValue();
            if (value > max) {
                max = 0L;
                max += value;
            }
        }
        
        for (Map.Entry<Integer, Long> entry : freq.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
