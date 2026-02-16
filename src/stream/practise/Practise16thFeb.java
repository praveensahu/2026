package stream.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise16thFeb {
    public static void main(String[] args) {
        //FIndSingleOccurrenceWordsInSentences
        List<String> sentences = List.of("Java is a programming language",
                "Streams are a new feature in Java",
                "Java streams provide a modern way to process data");

        Set<String> s = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)  // Filter entries where count == 1
                .map(Map.Entry::getKey)                   // Get the word (key) from the entry
                .collect(Collectors.toSet());
        String input = "apple banana kiwi orange fig strawberry";
        Arrays.stream(input.split("\\s")).max(Comparator.comparingInt(String::length).reversed()).get();
        List<Student> studentList = getStudentList();
        studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getMarks)))

    }

    private static List<Student> getStudentList() {
        return List.of(new Student(10,"P"),
                new Student(30,"R"),
                new Student(20,"A"),
                new Student(80,"V"),
                new Student(50,"E"));


    }

    static class Student{
        int marks;
        String name;

        public Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public String getName() {
            return name;
        }
    }
}
