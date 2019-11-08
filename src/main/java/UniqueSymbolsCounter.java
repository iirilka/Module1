public class UniqueSymbolsCounter {
    public int countUnique(int[] array) {
        int difference = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    number++;
                    break;
                }
            }
        }
        difference = array.length - number;
        return difference;
    }
}
