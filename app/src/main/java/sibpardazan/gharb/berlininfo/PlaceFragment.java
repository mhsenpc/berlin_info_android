package sibpardazan.gharb.berlininfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.card.MaterialCardView;

public class PlaceFragment extends Fragment {

    private static final String ARG_PLACE_INDEX = "place_index";

    private int placeIndex;

    public PlaceFragment() {
        // Required empty public constructor
    }

    public static PlaceFragment newInstance(int placeIndex) {
        PlaceFragment fragment = new PlaceFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PLACE_INDEX, placeIndex);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            placeIndex = getArguments().getInt(ARG_PLACE_INDEX);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_place, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Get views
        TextView titleText = view.findViewById(R.id.tv_title);
        TextView historyText = view.findViewById(R.id.tv_history);
        TextView infoText = view.findViewById(R.id.tv_info);
        TextView tipsText = view.findViewById(R.id.tv_tips);
        ImageView imageView = view.findViewById(R.id.iv_place);

        // Test with hardcoded content first
        titleText.setText("Test Title: " + placeIndex);
        historyText.setText("This is test history content for place " + placeIndex);
        infoText.setText("This is test info content for place " + placeIndex);
        tipsText.setText("This is test tips content for place " + placeIndex);

        // Try to load actual content
        PlaceData.PlaceContent placeContent = PlaceData.getPlace(placeIndex, requireContext());

        if (placeContent != null) {
            titleText.setText(placeContent.title);
            historyText.setText(placeContent.history);
            infoText.setText(placeContent.info);
            tipsText.setText(placeContent.tips);
            imageView.setImageResource(R.drawable.ic_launcher_foreground); // Default placeholder

            // Debug logging
            android.util.Log.d("PlaceFragment", "Loaded place " + placeIndex + ": " + placeContent.title);
        } else {
            android.util.Log.e("PlaceFragment", "Failed to load place content for index: " + placeIndex);
            // Keep the test content if real content fails
        }
    }
}