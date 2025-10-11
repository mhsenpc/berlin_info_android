# BerlinInfo - Berlin Tourism Guide

<img src="app/src/main/res/mipmap-hdpi/ic_launcher.png" alt="BerlinInfo Logo" width="100"/>

**BerlinInfo** (اطلاعات برلین) is a comprehensive Android tourism guide application for Berlin, designed specifically for Persian/Farsi-speaking visitors. The app provides detailed information about 20+ historical attractions, museums, and monuments in Berlin, all presented in the Persian language.

## 📱 Features

- **🏛️ 20+ Historical Locations**: Complete information about Berlin's most famous attractions including Brandenburg Gate, Berlin Wall, Reichstag, Museum Island, and more
- **📖 Rich Persian Content**: All content available in Farsi with historical context, visiting information, and helpful tips
- **🔍 Search Functionality**: Quick search for places by name or keywords
- **⭐ Bookmark System**: Save your favorite places for quick access
- **📋 Detailed Information**: Each location includes:
  - Historical background and significance
  - Visiting hours and ticket prices
  - Exact addresses and locations
  - Pro tips for visitors
- **🎨 Beautiful UI**: Clean, intuitive interface with Material Design
- **📱 Responsive Design**: Optimized for various Android devices

## 🏛️ Featured Locations

The app covers Berlin's most iconic attractions:

### Historical Sites
- Brandenburg Gate (دروازه براندنبورگ)
- Berlin Wall (دیوار برلین)
- Reichstag Building (رایشستاگ)
- Checkpoint Charlie (پاسگاه چارلی)
- Holocaust Memorial (بن یادبود هولوکاست)

### Museums & Culture
- Museum Island (جزیره موزه‌ها)
- Berlin Cathedral (کلیسای جامع برلین)
- Gropius Bau (موزه گروپیوس‌بائو)

### Palaces & Gardens
- Charlottenburg Palace (کاخ شارلوتنبورگ)

### Modern Attractions
- TV Tower (برج تلویزیون برلین)
- Potsdamer Platz (پوتسدامر پلاتز)
- Alexanderplatz (میدان الکساندر)

### Parks & Recreation
- Berlin Zoo (باغ وحش برلین)
- Treptower Park (پارک ترپتاور)
- Tempelhof Airport (فرودگاه تمپلهوف)

## 🛠️ Technical Details

- **Platform**: Android
- **Language**: Java
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 36
- **Build Tool**: Gradle with Kotlin DSL
- **Architecture**: Single Activity with ViewPager2
- **UI Framework**: Android Material Design with ViewBinding

### Key Components
- **MainActivity**: Main screen with ViewPager2 for place navigation
- **PlaceFragment**: Individual place detail screens
- **SearchActivity**: Search functionality with filtering
- **BookmarksActivity**: Bookmark management
- **BookmarkManager**: Persistent bookmark storage
- **PlaceData**: Centralized data management for all locations

## 📋 Requirements

- Android 7.0 (API level 24) or higher
- 50MB+ storage space
- Internet connection for external links

## 🚀 Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/mhsenpc/BerlinInfo.git
   ```

2. Open the project in Android Studio

3. Build and run the project:
   ```bash
   ./gradlew assembleDebug
   ```

4. Install the APK on your device or emulator

## 📸 Screenshots

*(Add screenshots here when available)*

## 🌍 Language Support

- **Primary**: Persian/Farsi (فارسی)
- **Secondary**: English (for place names and references)

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### Areas for Contribution:
- Translation improvements
- New attraction information
- UI/UX enhancements
- Bug fixes
- Performance optimizations

## 🙏 Acknowledgments

- Thanks to the Berlin tourism board and various cultural institutions for reference information
- Material Design guidelines for UI inspiration
- The Android developer community for various libraries and tools

## 📈 Version History

- **Version 1.1** (Current): Enhanced search functionality and bookmark system
- **Version 1.0**: Initial release with 20+ Berlin attractions

---

**Made with ❤️ for Persian-speaking travelers exploring Berlin**