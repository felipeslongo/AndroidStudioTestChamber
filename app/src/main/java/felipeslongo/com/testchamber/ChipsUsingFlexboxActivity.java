package felipeslongo.com.testchamber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

public class ChipsUsingFlexboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chips_using_flexbox);

        TextView newChip = new TextView(this);
        newChip.setText("Dynamic Chip");
        newChip.setBackgroundResource( R.drawable.chip);

        FlexboxLayout chipGroup = findViewById(R.id.chipGroup);
        chipGroup.addView(newChip);
    }
}
