# Deckard

A simple template for Android development using Robolectric, Maven and IntelliJ.

## Setup

To get an Android project setup:

1. Install Gradle 1.6 (the latest version does not work with the Robolectric plugin). On Mac OS X run:

        > git checkout 7900579 /usr/local/Library/Formula/gradle.rb
        > brew install gradle

1. Install the Android SDK. On Mac OS X just run:

        > brew install android-sdk

2. Set ANDROID_HOME to '/usr/local/Cellar/android-sdk/<version>'.

3. Run the Android SDK GUI and install API 16 and any other APIs you might need. You can start the GUI like so:

        > android


4. Check this repo out.

5. In the project directory you should be able to run the tests:

        > ./gradlew check
        
6. Import the project into Android Studio by selecting 'Import Project' in Android Studio and selecting the project's `build.gradle`.

7. Build an app. Win.
