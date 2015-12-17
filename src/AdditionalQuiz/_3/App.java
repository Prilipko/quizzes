package AdditionalQuiz._3;

/**
 * Created by Worker on 15.12.2015.
 */
public class App {
    public class outer {
        public class inner{}
    }
    public void main(String[] args) {
        float f = 2;
        outer.inner x = new outer().new inner();
//        boolean f = false;
    }
}
