package vce.com.newvsv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ResList extends AppCompatActivity {
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_list);
        textView1=(TextView)findViewById(R.id.ansBT);
        textView2=(TextView)findViewById(R.id.queLi);
        Placement s=Results.p;
        textView2.setText(s.getQue());
        textView1.setText(s.getAns());
    }
}
