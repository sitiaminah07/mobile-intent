package id.ac.polinema.intent;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        User u = extras.getParcelable("user");
        if (extras != null) {

            // TODO: display value here
            usernameText.setText(u.getUsername());
            nameText.setText(u.getName());
            ageText.setText(String.valueOf(u.getAge()));
        }
    }
}
