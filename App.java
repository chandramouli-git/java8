package mouli;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
System.out .println("calculate average of numbers");
System.out.println("Enter length of the array?");
Scanner scnr = new Scanner(System.in);
int length = scnr.nextInt();
int[] input = new int[length];
for (int i = 0; i < length; i++) {
input[i] = scnr.nextInt();
}
float average = average(input);
System.out.println(average);
scnr.close(); }

public static float average(int[] input) {
float sum = 0f;
for (int number : input) {
sum = sum + number;
}
return sum / input.length;
}
}


