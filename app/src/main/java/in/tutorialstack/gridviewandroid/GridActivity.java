package in.tutorialstack.gridviewandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import in.tutorialstack.adapter.CustomAdapter;

public class GridActivity extends AppCompatActivity {
    String TAG = GridActivity.class.getSimpleName();

    int image[] = {R.drawable.tutorialstack, R.drawable.tutorialstack_white, R.drawable.tutorialstack,
            R.drawable.tutorialstack_white, R.drawable.tutorialstack, R.drawable.tutorialstack_white,
            R.drawable.tutorialstack, R.drawable.tutorialstack_white, R.drawable.tutorialstack,
            R.drawable.tutorialstack_white, R.drawable.tutorialstack, R.drawable.tutorialstack_white};
    String names[] = {"Aman", "Rakesh", "Sunil", "Vikash", "Anil", "Rahul", "Vikash", "Naveen", "Harish", "Vijay",
            "Aasim", "Vinod"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        try {
            GridView gridview = (GridView) findViewById(R.id.grid_view);
            CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), names, image);
            gridview.setAdapter(customAdapter);
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(GridActivity.this, "Item Position : " + position, Toast.LENGTH_SHORT).show();
                }
            });

        } catch (Exception ex) {
            Log.e(TAG, ex.getMessage());
        }
    }
}