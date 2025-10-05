package sibpardazan.gharb.berlininfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        MaterialCardView cardTvTower = findViewById(R.id.card_tv_tower);
        MaterialCardView cardHolocaustMemorial = findViewById(R.id.card_holocaust_memorial);
        MaterialCardView cardUnterDenLinden = findViewById(R.id.card_unter_den_linden);
        MaterialCardView cardKaiserWilhelmChurch = findViewById(R.id.card_kaiser_wilhelm_church);
        MaterialCardView cardGropiusBau = findViewById(R.id.card_gropius_bau);
        MaterialCardView cardTempelhofAirport = findViewById(R.id.card_tempelhof_airport);
        MaterialCardView cardHackescherMarkt = findViewById(R.id.card_hackescher_markt);
        MaterialCardView cardSpandauCitadel = findViewById(R.id.card_spandau_citadel);
        MaterialCardView cardTreptowerPark = findViewById(R.id.card_treptower_park);
        MaterialCardView cardEastSideGallery = findViewById(R.id.card_east_side_gallery);

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

        cardTvTower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TvTowerActivity.class));
            }
        });

        cardHolocaustMemorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HolocaustMemorialActivity.class));
            }
        });

        cardUnterDenLinden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UnterDenLindenActivity.class));
            }
        });

        cardKaiserWilhelmChurch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KaiserWilhelmChurchActivity.class));
            }
        });

        cardGropiusBau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GropiusBauActivity.class));
            }
        });

        cardTempelhofAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TempelhofAirportActivity.class));
            }
        });

        cardHackescherMarkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HackescherMarktActivity.class));
            }
        });

        cardSpandauCitadel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpandauCitadelActivity.class));
            }
        });

        cardTreptowerPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TreptowerParkActivity.class));
            }
        });

        cardEastSideGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EastSideGalleryActivity.class));
            }
        });
    }
}