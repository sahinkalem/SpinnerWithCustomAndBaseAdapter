package sahinkalem.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner and Array
        Spinner spinnerForArrayAdapter = findViewById(R.id.spinnerForArrayAdapter);
        String[] numbers = getResources().getStringArray(R.array.numbers);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, numbers);
        arrayAdapter.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        spinnerForArrayAdapter.setAdapter(arrayAdapter);

        spinnerForArrayAdapter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "Selected Item Position:" + years[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Spinner, Custom Item Layout and Custom Adapter
        Spinner spinnerForCustomAdapter = findViewById(R.id.spinnerForCustomAdapter);
        List<String> numberList = Arrays.asList(getResources().getStringArray(R.array.years));
        YearsBaseAdapter baseAdapter = new YearsBaseAdapter(this, numberList);
        spinnerForCustomAdapter.setAdapter(baseAdapter);
        spinnerForCustomAdapter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "Selected Item Position:" + numberList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}