package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialSchedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] data = input.split(":");
            String commandMain = data[0];
            switch (commandMain) {
                case "Add":
                    String lessonToAdd = data[1];

                    if (!initialSchedule.contains(lessonToAdd)) {
                        initialSchedule.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToAddAtIndex = data[1];
                    int index = Integer.parseInt(data[2]);
                    if (!initialSchedule.contains(lessonToAddAtIndex)) {
                        initialSchedule.add(index, lessonToAddAtIndex);
                    }
                    break;
                case "Remove":
                    String lessonToRemove = data[1];
                    if (initialSchedule.contains(lessonToRemove)) {
                        boolean isRemoved = false;
                        for (int i = 0; i < initialSchedule.size() - 1; i++) {
                            String currentLesson = initialSchedule.get(i);
                            if (currentLesson.equals(lessonToRemove) && initialSchedule.get(i + 1).equals(lessonToRemove + "-Exercise")) {
                                initialSchedule.remove(lessonToRemove);
                                initialSchedule.remove(i + 1);
                                isRemoved = true;
                                break;
                            }
                        }
                        if (!isRemoved) {
                            initialSchedule.remove(lessonToRemove);
                        }
                    }
                    break;
                case "Swap":
                    String lessonOne = data[1];
                    String lessonTwo = data[2];
                    int indexOfLessonOne = initialSchedule.indexOf(lessonOne);
                    int indexOfLessonTwo = initialSchedule.indexOf(lessonTwo);

                    if (initialSchedule.contains(lessonOne) && initialSchedule.contains(lessonTwo)) {
                        if (initialSchedule.contains(lessonOne) && initialSchedule.contains(lessonOne + "-Exercise") && initialSchedule.contains(lessonTwo) && initialSchedule.contains(lessonTwo + "-Exercise")) {
                            //ok
                            initialSchedule.set(indexOfLessonOne, lessonTwo);
                            initialSchedule.set(indexOfLessonOne + 1, lessonTwo + "-Exercise");
                            initialSchedule.set(indexOfLessonTwo, lessonOne);
                            initialSchedule.set(indexOfLessonTwo + 1, lessonOne + "-Exercise");
                        } else if (initialSchedule.contains(lessonOne) && !initialSchedule.contains(lessonOne + "-Exercise") && initialSchedule.contains(lessonTwo) && initialSchedule.contains(lessonTwo + "-Exercise")) {

                            if (indexOfLessonOne < indexOfLessonTwo){
                                initialSchedule.set(indexOfLessonOne, lessonTwo);
                                initialSchedule.add(indexOfLessonOne + 1, lessonTwo + "-Exercise");
                                initialSchedule.set(indexOfLessonTwo + 1, lessonOne);
                                initialSchedule.remove(indexOfLessonTwo + 2);
                            } else {
                                initialSchedule.set(indexOfLessonOne, lessonTwo);
                                initialSchedule.add(indexOfLessonOne + 1, lessonTwo + "-Exercise");
                                initialSchedule.set(indexOfLessonTwo, lessonOne);
                                initialSchedule.remove(indexOfLessonTwo + 1);
                            }
                        } else if (initialSchedule.contains(lessonOne) && initialSchedule.contains(lessonOne + "-Exercise") && initialSchedule.contains(lessonTwo) && !initialSchedule.contains(lessonTwo + "-Exercise")) {

                            if (indexOfLessonOne < indexOfLessonTwo){

                                initialSchedule.set(indexOfLessonOne, lessonTwo);
                                initialSchedule.set(indexOfLessonTwo, lessonOne);
                                initialSchedule.add(indexOfLessonTwo + 1, lessonOne + "-Exercise");
                                initialSchedule.remove(indexOfLessonOne + 1);
                            } else {

                                initialSchedule.set(indexOfLessonTwo, lessonOne);
                                initialSchedule.set(indexOfLessonOne, lessonTwo);
                                initialSchedule.add(indexOfLessonTwo + 1, lessonOne + "-Exercise");
                                initialSchedule.remove(indexOfLessonOne + 2);
                            }

                        } else {

                            initialSchedule.set(indexOfLessonOne, lessonTwo);
                            initialSchedule.set(indexOfLessonTwo, lessonOne);
                        }
                    }
                    break;
                case "Exercise":
                    String lessonAndExercise = data[1];
                    if (initialSchedule.contains(lessonAndExercise) && !initialSchedule.contains(lessonAndExercise + "-Exercise")) {
                        int indexOfTheLesson = initialSchedule.indexOf(lessonAndExercise);
                        initialSchedule.add(indexOfTheLesson + 1, lessonAndExercise + "-Exercise");
                    } else if (!initialSchedule.contains(lessonAndExercise) && !initialSchedule.contains(lessonAndExercise + "-Exercise")) {
                        //ok
                        initialSchedule.add(lessonAndExercise);
                        initialSchedule.add(lessonAndExercise + "-Exercise");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < initialSchedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, initialSchedule.get(i));
        }
    }
}
/*
*SoftUni Course Planning
You are tasked to help plan the next Programming Fundamentals course by keeping track of the lessons,
that are going to be included in the course, as well as all the exercises for the lessons.
On the first input line, you will receive the initial schedule of lessons and exercises that are going to be part of the next course,
separated by comma and space ", ". But before the course starts, there are some changes to be made.
Until you receive "course start" you will be given some commands to modify the course schedule. The possible commands are:

Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
Insert:{lessonTitle}:{index} -insert the lesson to the given index, if it does not exist
Remove:{lessonTitle} -remove the lesson, if it exists
Swap:{lessonTitle}:{lessonTitle} -change the place of the two lessons, if they exist
Exercise:{lessonTitle} -add Exercise in the schedule right after the lesson index,
if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise".
If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.

Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.
Input
•	On the first line -the initial schedule lessons -strings, separated by comma and space ", ".
•	Until "course start" you will receive commands in the format described above.
Output
•	Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
"{lesson index}.{lessonTitle}".
•	Allowed working time / memory: 100ms / 16MB.

 */