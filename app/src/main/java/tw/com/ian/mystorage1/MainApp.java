package tw.com.ian.mystorage1;

import android.app.Application;
import android.content.SharedPreferences;

public class MainApp extends Application  {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    User user;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = getSharedPreferences("user.data",MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public String getUser() {
        return sharedPreferences.getString("user","");
    }
    public  String getPwd()
    {
        return sharedPreferences.getString("pwd","");
    }

    public void setUser(String user){
        editor.putString("user",user);
        editor.commit();
    }

    public void setPwd(String pwd){
        editor.putString("pwd",pwd);
        editor.commit();
    }
}
