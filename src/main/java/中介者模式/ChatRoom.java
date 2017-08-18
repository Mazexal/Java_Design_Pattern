package 中介者模式;

import java.util.Date;

/**
 * Created by 10235 on 2017/8/18.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}