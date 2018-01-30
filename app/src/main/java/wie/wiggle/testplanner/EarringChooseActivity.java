package wie.wiggle.testplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by test on 23.08.2017.
 */

public class EarringChooseActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCancel;
    private Button btnClear;
    private View viewEarringTungrad;
    private View viewEarringBlueCoral;
    private View viewEarringRedCoral;
    private View viewEarringWitch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earring_choose);

        btnCancel = (Button) findViewById(R.id.buttonCancelEarring);
        btnClear = (Button) findViewById(R.id.buttonClearEarring);
        viewEarringTungrad = findViewById(R.id.earringTungrad);
        viewEarringBlueCoral = findViewById(R.id.earringBlueCoral);
        viewEarringRedCoral = findViewById(R.id.earringRedCoral);
        viewEarringWitch = findViewById(R.id.earringWitch);

        btnCancel.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        viewEarringTungrad.setOnClickListener(this);
        viewEarringBlueCoral.setOnClickListener(this);
        viewEarringRedCoral.setOnClickListener(this);
        viewEarringWitch.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.earringTungrad:
                intent.putExtra("earringName", "earringTungrad");
                intent.putExtra("AP", 7);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.earringBlueCoral:
                intent.putExtra("earringName", "earringBlueCoral");
                intent.putExtra("AP", 4);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.earringRedCoral:
                intent.putExtra("earringName", "earringRedCoral");
                intent.putExtra("AP", 2);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.earringWitch:
                intent.putExtra("earringName", "earringWitch");
                intent.putExtra("AP", 5);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.buttonClearEarring:
                intent.putExtra("earringName", "earringPlaceholder");
                intent.putExtra("AP", 0);
                intent.putExtra("DP", 0);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.buttonCancelEarring:
                finish();
                break;
        }


    }
}
