public class ArrayKnowledge {
    public static void main(String[] args) {
        System.out.println(stringToArray("Ham"));
        System.out.println(stringToArray("I eat cheddar"));
        System.out.println(stringToArray("I like bread"));
        System.out.println();
        int[] intArray = generateArrayWithBounds(11, 18, 3);
        for (int i=0; i<intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
    public static char[] stringToArray(String string) {
        int length = string.length();
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            char addMe = string.charAt(i);
            array[i] = addMe;
        }
        return array;
    }
    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int arraySize = 0;
        for (int i = start; i < end; i = i + step) {
            arraySize = arraySize + 1;
        }
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int addMe = start + (step *i);
            array[i] = addMe;
        }
        return array;
    }
}
