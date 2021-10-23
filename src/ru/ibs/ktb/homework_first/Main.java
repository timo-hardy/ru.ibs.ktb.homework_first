package ru.ibs.ktb.homework_first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Developer(
                        "Vasya",
                        "Petrov",
                        24,
                        "male",
                        "petrov@yandex.ru",
                        "Java",
                        3,
                        "15"
                )
        );

        employeeSet.add(new Supervisior(
                        "Petya",
                        "Ivanov",
                        34,
                        "male",
                        "ivanov@gmail.com",
                        "1234",
                        100_000
                )
        );

        employeeSet.add(new Trainee(
                        "Katya",
                        "Bobrova",
                        21,
                        "female",
                        "bobrova@mail.ru",
                        "Java",
                        3,
                        "https//www.github.com/....."
                )
        );

        List<Employee> employeesList = new ArrayList<>();
        employeesList.addAll(employeeSet);
    }

}
