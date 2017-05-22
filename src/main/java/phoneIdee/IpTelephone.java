package phoneIdee;

/**
 * Created by redi on 5/22/17.
 */
public interface IpTelephone extends FixedPhone {
     void sendData(String data);
     void launchVideoCall();
     void setupConference();
}
