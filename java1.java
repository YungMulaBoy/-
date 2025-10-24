1. Упорядочивание методом нахождения минимального элемента
public class MinimumElementOrdering {
    public static void arrangeByMinimum(int[] data) {
        for (int current = 0; current < data.length - 1; current++) {
            int smallestPosition = current;
            for (int search = current + 1; search < data.length; search++) {
                if (data[search] < data[smallestPosition]) {
                    smallestPosition = search;
                }
            }
            int temporary = data[smallestPosition];
            data[smallestPosition] = data[current];
            data[current] = temporary;
        }
    }

    public static void main(String[] args) {
        int[] sampleData = {64, 25, 12, 22, 11};
        System.out.print("Начальный набор: ");
        for (int value : sampleData) {
            System.out.print(value + " ");
        }

        arrangeByMinimum(sampleData);

        System.out.print("\nУпорядоченный набор: ");
        for (int value : sampleData) {
            System.out.print(value + " ");
        }
    }
}
4. Упорядочивание методом объединения
import java.util.Arrays;

public class CombineSort {
    public static int[] combineOrdering(int[] elements) {
        if (elements.length <= 1) {
            return elements;
        }

        int center = elements.length / 2;
        int[] firstPart = Arrays.copyOfRange(elements, 0, center);
        int[] secondPart = Arrays.copyOfRange(elements, center, elements.length);

        firstPart = combineOrdering(firstPart);
        secondPart = combineOrdering(secondPart);

        return combineParts(firstPart, secondPart);
    }

    private static int[] combineParts(int[] first, int[] second) {
        int[] combined = new int[first.length + second.length];
        int firstIndex = 0, secondIndex = 0, resultIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                combined[resultIndex++] = first[firstIndex++];
            } else {
                combined[resultIndex++] = second[secondIndex++];
            }
        }

        while (firstIndex < first.length) {
            combined[resultIndex++] = first[firstIndex++];
        }

        while (secondIndex < second.length) {
            combined[resultIndex++] = second[secondIndex++];
        }

        return combined;
    }

    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Исходные данные: " + Arrays.toString(numbers));

        int[] orderedNumbers = combineOrdering(numbers);

        System.out.println("Обработанные данные: " + Arrays.toString(orderedNumbers));
    }
}
7. Упорядочивание с использованием двоичной кучи
public class BinaryTreeSort {
    public static void treeBasedSort(int[] data) {
        int size = data.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            adjustTree(data, size, i);
        }

        for (int i = size - 1; i > 0; i--) {
            int swapValue = data[0];
            data[0] = data[i];
            data[i] = swapValue;

            adjustTree(data, i, 0);
        }
    }

    private static void adjustTree(int[] data, int size, int root) {
        int mainNode = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        if (leftChild < size && data[leftChild] > data[mainNode]) {
            mainNode = leftChild;
        }

        if (rightChild < size && data[rightChild] > data[mainNode]) {
            mainNode = rightChild;
        }

        if (mainNode != root) {
            int temporary = data[root];
            data[root] = data[mainNode];
            data[mainNode] = temporary;

            adjustTree(data, size, mainNode);
        }
    }

    public static void main(String[] args) {
        int[] values = {12, 11, 13, 5, 6, 7};
        System.out.println("Первоначальный массив: " + java.util.Arrays.toString(values));

        treeBasedSort(values);

        System.out.println("Структурированный массив: " + java.util.Arrays.toString(values));
    }
}
10. Поиск с использованием интерполяции
public class ProportionalSearch {
    public static int proportionalFind(int[] data, int start, int end, int target) {
        if (start <= end && target >= data[start] && target <= data[end]) {
            int estimatedPosition = start + (((end - start) * (target - data[start])) / (data[end] - data[start]));

            if (data[estimatedPosition] == target) {
                return estimatedPosition;
            }

            if (data[estimatedPosition] < target) {
                return proportionalFind(data, estimatedPosition + 1, end, target);
            }

            if (data[estimatedPosition] > target) {
                return proportionalFind(data, start, estimatedPosition - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedData = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int searchValue = 18;

        int foundIndex = proportionalFind(sortedData, 0, sortedData.length - 1, searchValue);

        if (foundIndex != -1) {
            System.out.println("Искомый элемент расположен по индексу: " + foundIndex);
        } else {
            System.out.println("Элемент в массиве отсутствует");
        }
    }
}
