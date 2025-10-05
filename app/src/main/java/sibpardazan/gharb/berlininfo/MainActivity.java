package sibpardazan.gharb.berlininfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private MaterialButton btnPrevious, btnNext;
    private TextView tvPlaceCounter;
    private PlacePagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.main_title);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager);
        btnPrevious = findViewById(R.id.btn_previous);
        btnNext = findViewById(R.id.btn_next);
        tvPlaceCounter = findViewById(R.id.tv_place_counter);

        setupViewPager();
        setupNavigationButtons();
        updatePlaceCounter(0);
    }

    private void setupViewPager() {
        adapter = new PlacePagerAdapter(this);
        viewPager.setAdapter(adapter);

        android.util.Log.d("MainActivity", "ViewPager setup complete. Total places: " + adapter.getItemCount());

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                android.util.Log.d("MainActivity", "Page selected: " + position);
                updatePlaceCounter(position);
                updateNavigationButtons(position);
            }
        });
    }

    private void setupNavigationButtons() {
        btnPrevious.setOnClickListener(v -> {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem > 0) {
                viewPager.setCurrentItem(currentItem - 1);
            }
        });

        btnNext.setOnClickListener(v -> {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem < adapter.getItemCount() - 1) {
                viewPager.setCurrentItem(currentItem + 1);
            }
        });
    }

    private void updatePlaceCounter(int position) {
        tvPlaceCounter.setText((position + 1) + " / " + adapter.getItemCount());
    }

    private void updateNavigationButtons(int position) {
        btnPrevious.setEnabled(position > 0);
        btnNext.setEnabled(position < adapter.getItemCount() - 1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}