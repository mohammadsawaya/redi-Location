package phoneIdee;

/**
 * Created by redi on 5/22/17.
 */
public interface MobilePhone extends Phone {
     void sendSMS(String sms,String num);
     void receiveSMS();

}
