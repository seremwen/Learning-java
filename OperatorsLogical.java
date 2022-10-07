import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class OperatorsLogical {

static List<String> terms = new ArrayList<>() {{
add("Rose");
add(null);
}};

   public static void main(String []args) {
for (int i = 0; i < 20; ++i) {
int rnd = getRandomNumber();
String term = terms.get(rnd);
System.out.println("Generated index: " + rnd);
if (term != null && term.equals("Rose")) { 
System.out.println("Rose was found");
}
}
}
private static int getRandomNumber() {
Random r = new Random();
return r.nextInt(10);
}
}