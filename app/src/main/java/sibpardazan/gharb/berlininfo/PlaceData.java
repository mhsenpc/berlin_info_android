package sibpardazan.gharb.berlininfo;

import android.content.Context;

public class PlaceData {

    public static class PlaceContent {
        public String title;
        public String history;
        public String info;
        public String tips;

        public PlaceContent(String title, String history, String info, String tips) {
            this.title = title;
            this.history = history;
            this.info = info;
            this.tips = tips;
        }
    }

    public static PlaceContent getPlace(int index, Context context) {

        switch (index) {
            case 0:
                return new PlaceContent(
                    context.getString(R.string.brandenburg_gate),
                    context.getString(R.string.brandenburg_gate_history),
                    context.getString(R.string.brandenburg_gate_info),
                    context.getString(R.string.brandenburg_gate_tips)
                );
            case 1:
                return new PlaceContent(
                    context.getString(R.string.berlin_wall),
                    context.getString(R.string.berlin_wall_history),
                    context.getString(R.string.berlin_wall_info),
                    context.getString(R.string.berlin_wall_tips)
                );
            case 2:
                return new PlaceContent(
                    context.getString(R.string.reichstag),
                    context.getString(R.string.reichstag_history),
                    context.getString(R.string.reichstag_info),
                    context.getString(R.string.reichstag_tips)
                );
            case 3:
                return new PlaceContent(
                    context.getString(R.string.museum_island),
                    context.getString(R.string.museum_island_history),
                    context.getString(R.string.museum_island_info),
                    context.getString(R.string.museum_island_tips)
                );
            case 4:
                return new PlaceContent(
                    context.getString(R.string.charlottenburg_palace),
                    context.getString(R.string.charlottenburg_palace_history),
                    context.getString(R.string.charlottenburg_palace_info),
                    context.getString(R.string.charlottenburg_palace_tips)
                );
            case 5:
                return new PlaceContent(
                    context.getString(R.string.berlin_cathedral),
                    context.getString(R.string.berlin_cathedral_history),
                    context.getString(R.string.berlin_cathedral_info),
                    context.getString(R.string.berlin_cathedral_tips)
                );
            case 6:
                return new PlaceContent(
                    context.getString(R.string.alexanderplatz),
                    context.getString(R.string.alexanderplatz_history),
                    context.getString(R.string.alexanderplatz_info),
                    context.getString(R.string.alexanderplatz_tips)
                );
            case 7:
                return new PlaceContent(
                    context.getString(R.string.potzdamer_platz),
                    context.getString(R.string.potzdamer_platz_history),
                    context.getString(R.string.potzdamer_platz_info),
                    context.getString(R.string.potzdamer_platz_tips)
                );
            case 8:
                return new PlaceContent(
                    context.getString(R.string.checkpoint_charlie),
                    context.getString(R.string.checkpoint_charlie_history),
                    context.getString(R.string.checkpoint_charlie_info),
                    context.getString(R.string.checkpoint_charlie_tips)
                );
            case 9:
                return new PlaceContent(
                    context.getString(R.string.berlin_zoo),
                    context.getString(R.string.berlin_zoo_history),
                    context.getString(R.string.berlin_zoo_info),
                    context.getString(R.string.berlin_zoo_tips)
                );
            case 10:
                return new PlaceContent(
                    context.getString(R.string.tv_tower),
                    context.getString(R.string.tv_tower_history),
                    context.getString(R.string.tv_tower_info),
                    context.getString(R.string.tv_tower_tips)
                );
            case 11:
                return new PlaceContent(
                    context.getString(R.string.holocaust_memorial),
                    context.getString(R.string.holocaust_memorial_history),
                    context.getString(R.string.holocaust_memorial_info),
                    context.getString(R.string.holocaust_memorial_tips)
                );
            case 12:
                return new PlaceContent(
                    context.getString(R.string.unter_den_linden),
                    context.getString(R.string.unter_den_linden_history),
                    context.getString(R.string.unter_den_linden_info),
                    context.getString(R.string.unter_den_linden_tips)
                );
            case 13:
                return new PlaceContent(
                    context.getString(R.string.kaiser_wilhelm_church),
                    context.getString(R.string.kaiser_wilhelm_church_history),
                    context.getString(R.string.kaiser_wilhelm_church_info),
                    context.getString(R.string.kaiser_wilhelm_church_tips)
                );
            case 14:
                return new PlaceContent(
                    context.getString(R.string.gropius_bau),
                    context.getString(R.string.gropius_bau_history),
                    context.getString(R.string.gropius_bau_info),
                    context.getString(R.string.gropius_bau_tips)
                );
            case 15:
                return new PlaceContent(
                    context.getString(R.string.tempelhof_airport),
                    context.getString(R.string.tempelhof_airport_history),
                    context.getString(R.string.tempelhof_airport_info),
                    context.getString(R.string.tempelhof_airport_tips)
                );
            case 16:
                return new PlaceContent(
                    context.getString(R.string.hackescher_markt),
                    context.getString(R.string.hackescher_markt_history),
                    context.getString(R.string.hackescher_markt_info),
                    context.getString(R.string.hackescher_markt_tips)
                );
            case 17:
                return new PlaceContent(
                    context.getString(R.string.spandau_citadel),
                    context.getString(R.string.spandau_citadel_history),
                    context.getString(R.string.spandau_citadel_info),
                    context.getString(R.string.spandau_citadel_tips)
                );
            case 18:
                return new PlaceContent(
                    context.getString(R.string.treptower_park),
                    context.getString(R.string.treptower_park_history),
                    context.getString(R.string.treptower_park_info),
                    context.getString(R.string.treptower_park_tips)
                );
            case 19:
                return new PlaceContent(
                    context.getString(R.string.east_side_gallery),
                    context.getString(R.string.east_side_gallery_history),
                    context.getString(R.string.east_side_gallery_info),
                    context.getString(R.string.east_side_gallery_tips)
                );
            default:
                return null;
        }
    }

    public static int getPlaceCount() {
        return 20;
    }
}