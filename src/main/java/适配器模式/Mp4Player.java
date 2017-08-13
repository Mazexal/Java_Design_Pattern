package 适配器模式;

/**
 * Created by 10235 on 2017/8/13.
 */
public class Mp4Player implements AdvancedMediaPlayer{


    public void playVlc(String fileName) {
        //什么也不做
    }


    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}