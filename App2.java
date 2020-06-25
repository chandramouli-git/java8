
package stringcom.tdd.lambdastreams;
import java.util.*;
public class App2{
public static void main(String args[]){
List<String> myList = Arrays.asList("apple","cdmon","runner","avinash","anna");
String start = "a";
myList.stream()
     .map(s -> s.substring(0, 3))
    .filter(x -> x.startsWith(start))
    .forEach(System.out::println);
}
}


