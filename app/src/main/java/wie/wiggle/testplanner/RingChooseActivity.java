package wie.wiggle.testplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RingChooseActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCancel;
    private Button btnClear;
    private View viewRingBlueCoral;
    private View viewRingRedCoral;
    private View viewRingCrescent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring_choose);

        btnCancel = (Button) findViewById(R.id.buttonCancelRing);
        btnClear = (Button) findViewById(R.id.buttonClearRing);
        viewRingBlueCoral = findViewById(R.id.ringBlueCoral);
        viewRingRedCoral = findViewById(R.id.ringRedCoral);
        viewRingCrescent = findViewById(R.id.ringCrescent);

        btnCancel.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        viewRingBlueCoral.setOnClickListener(this);
        viewRingRedCoral.setOnClickListener(this);
        viewRingCrescent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.ringRedCoral:
                intent.putExtra("ringName", "ringRedCoral");
                intent.putExtra("AP", 5);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.ringBlueCoral:
                intent.putExtra("ringName", "ringBlueCoral");
                intent.putExtra("AP", 4);
                intent.putExtra("DP", 3);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.ringCrescent:
                intent.putExtra("ringName", "ringCrescent");
                intent.putExtra("AP", 5);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.buttonClearRing:
                intent.putExtra("ringName", "ringPlaceholder");
                intent.putExtra("AP", 0);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.buttonCancelRing:
                finish();
                break;
        }

    }

}
