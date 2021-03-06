package ru.ibs.ktb.homework_first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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
                        "Valya",
                        "Mamaeva",
                        20,
                        "female",
                        "mamaeva@mail.ru",
                        "Java",
                        4,
                        "https//www.github.com/....."
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

        employeeSet.add(new Trainee(
                        "Katya",
                        "Baranova",
                        19,
                        "female",
                        "baranova@mail.ru",
                        "Java",
                        2,
                        "https//www.github.com/....."
                )
        );

        // фильтрует по возрасту
        List<Employee> employeesListAge = new ArrayList<>(employeeSet)
                .stream()
                .filter(e -> e.getAge() >= 25)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(employeesListAge);

        // фильтрует по имени
        List<Employee> employeesListName = new ArrayList<>(employeeSet)
                .stream()
                .filter(e -> e.getName() == "Katya")
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(employeesListName);

        // фильтрует по классу Developer
        List<Employee> employeesListDeveloper = new ArrayList<>(employeeSet)
                .stream()
                .filter(e -> e instanceof  Developer)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(employeesListDeveloper);

        //Поток поля имени
        employeeSet.stream()
                .map(employee -> employee.getName())
                .forEach(System.out::println);

        // Поток из поля возраста
        employeeSet.stream()
                .map(employee -> employee.getAge())
                .forEach(System.out::println);


        //Анонимный класс
        Employee security = new Employee("Vladimir", "Popov", 23, "male", "Popov@mail.ru") {

            private boolean weapon;

            private boolean isWeapon() {
                return true;
            }

            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }

            @Override
            public String getSurname() {
                return super.getSurname();
            }

            @Override
            public void setSurname(String surname) {
                super.setSurname(surname);
            }

            @Override
            public int getAge() {
                return super.getAge();
            }

            @Override
            public void setAge(int age) {
                super.setAge(age);
            }

            @Override
            public String getGender() {
                return super.getGender();
            }

            @Override
            public void setGender(String gender) {
                super.setGender(gender);
            }

            @Override
            public String getMail() {
                return super.getMail();
            }

            @Override
            public void setMail(String mail) {
                super.setMail(mail);
            }

            @Override
            public boolean isWork() {
                return super.isWork();
            }

            @Override
            public boolean isNotWork() {
                return super.isNotWork();
            }
        };
    }
}
