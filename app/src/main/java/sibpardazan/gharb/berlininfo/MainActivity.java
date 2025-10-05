package sibpardazan.gharb.berlininfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.main_title);
        setSupportActionBar(toolbar);

        setupCardListeners();
    }

    private void setupCardListeners() {
        MaterialCardView cardBrandenburgGate = findViewById(R.id.card_brandenburg_gate);
        MaterialCardView cardBerlinWall = findViewById(R.id.card_berlin_wall);
        MaterialCardView cardReichstag = findViewById(R.id.card_reichstag);
        MaterialCardView cardMuseumIsland = findViewById(R.id.card_museum_island);
        MaterialCardView cardCharlottenburgPalace = findViewById(R.id.card_charlottenburg_palace);
        MaterialCardView cardBerlinCathedral = findViewById(R.id.card_berlin_cathedral);
        MaterialCardView cardAlexanderplatz = findViewById(R.id.card_alexanderplatz);
        MaterialCardView cardPotzdamerPlatz = findViewById(R.id.card_potzdamer_platz);
        MaterialCardView cardCheckpointCharlie = findViewById(R.id.card_checkpoint_charlie);
        MaterialCardView cardBerlinZoo = findViewById(R.id.card_berlin_zoo);

        cardBrandenburgGate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BrandenburgGateActivity.class));
            }
        });

        cardBerlinWall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BerlinWallActivity.class));
            }
        });

        cardReichstag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReichstagActivity.class));
            }
        });

        cardMuseumIsland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MuseumIslandActivity.class));
            }
        });

        cardCharlottenburgPalace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CharlottenburgPalaceActivity.class));
            }
        });

        cardBerlinCathedral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BerlinCathedralActivity.class));
            }
        });

        cardAlexanderplatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AlexanderplatzActivity.class));
            }
        });

        cardPotzdamerPlatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PotzdamerPlatzActivity.class));
            }
        });

        cardCheckpointCharlie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CheckpointCharlieActivity.class));
            }
        });

        cardBerlinZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BerlinZooActivity.class));
            }
        });
    }
}