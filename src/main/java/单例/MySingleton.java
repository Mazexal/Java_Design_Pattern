package 单例;

//单例模式
public class MySingleton {
    private static MySingleton mySingleton=null;

    private MySingleton(){}

    public static synchronized MySingleton getMySingleton(){
        if(mySingleton ==null){
            mySingleton=new MySingleton();
        }
        return mySingleton;
    }
}
