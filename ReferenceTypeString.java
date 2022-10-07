
public class ReferenceTypeString {

   public static void main(String []args) {
String text1 = null;

String text21 = "two";
String text22 = "two";
if (text21 == text22) {
System.out.println("Equal References");
} else {
System.out.println("Different References");
}
if (text21.equals(text22)) {
System.out.println("Equal Objects");
} else {
System.out.println("Different Objects");
}
}
}