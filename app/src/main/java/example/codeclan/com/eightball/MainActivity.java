package example.codeclan.com.eightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question);
        shakeButton = (Button)findViewById(R.id.shape_button);
    }

    public void onShakeButtonClicked(View button){
        String question = questionEditText.getText().toString();
        Log.d("Eight Ball", question);
        Answers answer = new Answers();
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer.getAnswer());
        this.startActivity(intent);
    }

}
