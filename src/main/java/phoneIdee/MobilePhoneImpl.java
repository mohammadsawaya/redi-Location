package phoneIdee;

/**
 * Created by redi on 5/22/17.
 */
public class MobilePhoneImpl extends PhoneImpl implements MobilePhone {

    @Override
    public void sendSMS(String sms, String num) {
        System.out.println("the msg: "+sms+"\n form : "+num);
    }

    @Override
    public void receiveSMS() {

    }
}
