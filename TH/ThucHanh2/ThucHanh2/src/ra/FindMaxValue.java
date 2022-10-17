package ra;

import java.util.List;

public class FindMaxValue {
        public static int findMax(List<Integer> numbers) {
            int max = numbers.get(0);
            for (int i = 0; i < numbers.size(); i++) {
                if (max < numbers.get(i)) {
                    max = numbers.get(i);
                }
            }
            return max;
        }

        public static void main(String[] args) {
            ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
            String PATH_NUMBER = "E:\\MD2\\Bai16\\TH\\ThucHanh2\\ThucHanh2\\src\\ra\\result.txt";
            String PATH_RESULT = "E:\\MD2\\Bai16\\TH\\ThucHanh2\\ThucHanh2\\src\\ra\\numbers.txt";
            List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
            int maxValue = findMax(numbers);
            readAndWriteFile.writeFile(PATH_RESULT, maxValue);
        }
    }