package com.epam.demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testNumbers(List.of("1", "2", "3", "4"));
    }

    public boolean testNumbers(List<String> numbers) {
        return Utils.isAllPositiveNumbers(numbers);
    }
}
