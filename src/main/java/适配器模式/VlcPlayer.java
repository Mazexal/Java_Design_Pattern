package 适配器模式;

/**
 * Created by 10235 on 2017/8/13.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }


    public void playMp4(String fileName) {
        //什么也不做
    }
}
