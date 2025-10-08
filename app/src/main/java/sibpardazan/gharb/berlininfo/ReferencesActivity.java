package sibpardazan.gharb.berlininfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferencesActivity extends AppCompatActivity {

    private ListView referencesListView;
    private ArrayAdapter<String> referencesAdapter;
    private List<String> referencesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.references_title);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        referencesListView = findViewById(R.id.references_list_view);

        setupReferencesList();
        setupReferencesAdapter();
        setupItemClickListener();
    }

    private void setupReferencesList() {
        // Define the reference URLs
        String[] referencesArray = {
            "https://elifinatlasi.com/berlin-gezilecek-yerler-berlin-rehberi/",
            "https://www.camping-bei-berlin.de/en/umgebung/berlin",
            "https://en.wikipedia.org/wiki/Berlin_Wall_graffiti_art",
            "https://www.welt-reisefuehrer.de/berlin_zoologischer_garten/",
            "https://stock.adobe.com/tr/search?k=berlin%20brandenburg",
            "https://www.expedia.com/things-to-do/berlin-charlottenburg-palace-entry-ticket-with-new-pavilion.a48420213.activity-details",
            "https://makronom.de/die-opossum-strategie-21197",
            "https://www.dw.com/es/diez-razones-para-seguir-la-huella-del-muro-de-berl%C3%ADn/g-62659843",
            "https://www.berlin.de/kultur-und-tickets/archiv/6376110-2805649-70-jahre-berliner-festspiele-wild-times-.html",
            "https://www.tripadvisor.com/Attraction_Review-g187323-d7083034-Reviews-or10-Hackescher_Markt-Berlin.html",
            "https://wayground.com/admin/quiz/5eb3d522cf9944001b5818e5/ns-zeit",
            "https://www.berlin.de/en/attractions-and-sights/district/charlottenburg-wilmersdorf/",
            "https://www.berlin-tickets.com/museum-island/about/",
            "https://www.myguideberlin.com/experiences/berlin-welcomecard-museum-island-public-transport",
            "https://www.headout.com/de/berlin-reichstag-tickets/gefuhrte-reichstagstour-auf-deutsch-oder-englisch-e-19441/",
            "https://www.ahoi-schiff.de/hafenwelten/berlin-spandau-deutschland",
            "https://www.thf-berlin.de/en/your-visit/tempelhof-field",
            "https://www.morgenpost.de/berlin/treptower-park/",
            "https://turkmenportal.com/en/blog/67786/gurbanguly-berdimuhamedov-takes-part-in-the-meeting-of-the-heads-of-delegations-of-the-central-asian-countries-and-the-eastern-committee-of-the-german-economy",
            "https://www.dailysabah.com/life/from-queen-to-dalai-lama-berlins-adlon-hotel-thrills-with-its-history/news",
            "https://gemini.google.com"
        };

        referencesList = new ArrayList<>(Arrays.asList(referencesArray));
    }

    private void setupReferencesAdapter() {
        referencesAdapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            referencesList
        );
        referencesListView.setAdapter(referencesAdapter);
    }

    private void setupItemClickListener() {
        referencesListView.setOnItemClickListener((parent, view, position, id) -> {
            String url = referencesList.get(position);
            openWebPage(url);
        });
    }

    private void openWebPage(String url) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            // Handle case where no browser app is available
            android.widget.Toast.makeText(this, R.string.error_no_browser, android.widget.Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}