package vce.com.newvsv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddQuestion extends AppCompatActivity {
    EditText company, que, ans, topic, round;
    RatingBar ratingBar;
    CheckBox radioButton;
    String cs="General",qs="General",as="General",ts="General",rs="General";
    Button submit;
    float rating;
    boolean selected;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
        company=(EditText)findViewById(R.id.company);
        que=(EditText)findViewById(R.id.que);
        ans=(EditText)findViewById(R.id.ans);
        submit=(Button)findViewById(R.id.submitque);
        ratingBar=(RatingBar)findViewById(R.id.rating);
        radioButton=(CheckBox) findViewById(R.id.selected);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked)
                    selected=true;
                else
                    selected=false;

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cs=company.getText().toString();
                qs=que.getText().toString();
                as=ans.getText().toString();
                ts=ans.getText().toString();
                rs=ans.getText().toString();
                rating=ratingBar.getRating();
                databaseReference= FirebaseDatabase.getInstance().getReference();
                Placement placement=new Placement(cs,qs,as,ts,rs,rating,selected);
                databaseReference.push().setValue(placement);
                Toast.makeText(AddQuestion.this,"Submitted Succesfully",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AddQuestion.this,MainActivity.class));
            }
        });

    }
