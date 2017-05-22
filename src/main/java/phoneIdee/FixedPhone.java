package phoneIdee;

/**
 * Created by redi on 5/22/17.
 */
public interface FixedPhone extends Phone {
     String detectNumber();
     void recall();
     String lookForNumber(int num);

}
