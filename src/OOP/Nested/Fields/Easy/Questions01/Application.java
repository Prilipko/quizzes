package OOP.Nested.Fields.Easy.Questions01;

/**
 * Created by Worker on 10.12.2015.
 */
public class Application {
    private int fieldInstance = 0;
    private static int fieldStatic = 0;

    public static class X {
        public void f() {
            fieldStatic = 1;
        }
    }
}
//+       A.	компилируется
//        B.	не компилируется