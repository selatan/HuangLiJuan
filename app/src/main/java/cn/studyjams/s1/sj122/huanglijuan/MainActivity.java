package cn.studyjams.s1.sj122.huanglijuan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToJiwawa(View view) {
        CheckBox JiwawaView = (CheckBox) findViewById(R.id.jiwawa_view);
        boolean isJiwawa = JiwawaView.isChecked();
        Intent intent = new Intent(this, Main2Activity.class);
        if (isJiwawa == true)
            startActivity(intent);
    }

    public void jumpToXiongtongzi(View view) {
        CheckBox XiongtongziView = (CheckBox) findViewById(R.id.xiongtongzi_view);
        boolean isXiongtongzi = XiongtongziView.isChecked();
        Intent intent = new Intent(this, Main3Activity.class);
        if (isXiongtongzi == true)
            startActivity(intent);
    }

    public void jumpToHehua(View view) {
        CheckBox HehuaView = (CheckBox) findViewById(R.id.hehua_view);
        boolean isHehua = HehuaView.isChecked();
        Intent intent = new Intent(this, Main4Activity.class);
        if (isHehua == true)
            startActivity(intent);
    }

    public void jumpToGuanyinlian(View view) {
        CheckBox GuanyinlianView = (CheckBox) findViewById(R.id.guanyinlian_view);
        boolean isGuanyinlianVies = GuanyinlianView.isChecked();
        Intent intent = new Intent(this, Main5Activity.class);
        if (isGuanyinlianVies == true)
            startActivity(intent);
    }

    public void jumpToTaozhiluan(View view) {
        CheckBox Taozhiluan = (CheckBox) findViewById(R.id.taozhiluan_view);
        boolean isTaozhiluan = Taozhiluan.isChecked();
        Intent intent = new Intent(this, Main6Activity.class);
        if (isTaozhiluan == true)
            startActivity(intent);
    }


    public void printMessage(View view) {
        CheckBox shengluohao = (CheckBox) findViewById(R.id.shengluehao_view);
        boolean isShengluehao = shengluohao.isChecked();
        if (isShengluehao == true)
            Toast.makeText(this, "未完待续", Toast.LENGTH_SHORT).show();
        return;
    }
}

