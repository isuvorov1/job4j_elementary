package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int t = data.length - 1;
            int min = MinDiapason.findMin(data, i, t);
            int index = FindLoop.indexOf(data, min, i, t);
                for (int b = i + 1; b < data.length; b++) {
                    if (data[b] < data[index]) {
                        data[index] = data[b];
                    }
                }
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
