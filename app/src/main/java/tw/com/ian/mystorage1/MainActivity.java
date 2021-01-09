package tw.com.ian.mystorage1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private AppCompatTextView tv_user,tv_pwd;
    String user,pwd;
    private MainApp app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_user = findViewById(R.id.user);
        tv_pwd = findViewById(R.id.passwd);
        app = (MainApp)getApplication();
    }

    public void login(View view) {
        user = app.getUser();
        pwd = app.getPwd();
        if(!user.equals("")) {
            tv_user.setText(user);
        }else {
            app.setUser(tv_user.getText().toString());
        }
        if(!pwd.equals("")){
            tv_pwd.setText(tv_pwd.getText().toString());
        }else {
        app.setPwd(tv_user.getText().toString());}
    }

}