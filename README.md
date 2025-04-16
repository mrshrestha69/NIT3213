##Final Assignment

#Overview

The Final Assignment** is an Android application developed for showcasing a basic login system, a visually interactive dashboard with images and details, and a detail screen that presents extended information. The app integrates **Retrofit** for API calls, **Hilt** for dependency injection, and follows the **MVVM** architectural pattern to ensure a clean and maintainable codebase.

---

#Features

- Login Screen**: Simple authentication using a username and password.
- Dashboard**: Horizontally scrollable list displaying items fetched from a remote API.
- Detail View**: Displays detailed information of a selected item from the dashboard.

---

#Architecture

- MVVM Pattern**: Separates concerns into `Model`, `View`, and `ViewModel` layers.
- Hilt (DI)**: Injects dependencies across the app for improved modularity and testability.
- Retrofit**: Handles HTTP network operations for API communication.

---

#Dependencies

- [`Retrofit`](https://square.github.io/retrofit/) – Type-safe HTTP client for Android.
- [`Hilt`](https://dagger.dev/hilt/) – Dependency Injection framework for Android.
- [`Gson`](https://github.com/google/gson) – JSON serialization/deserialization.
- [`LiveData`, `ViewModel`, `Navigation`] – Android Jetpack components.

---

#Setup

1. Clone the Repository:

   git clone (https://github.com/mrshrestha69/NIT3213) cd Final_Assignment

2. Open the Project:

   Open the project in Android Studio.

3.Install Dependencies:

  Sync the project with Gradle files to download the necessary dependencies.
  
4.Configure API:

  Ensure that the API base URL in NetworkModule is correctly set.

#Usage

1. Run the Application:
   Connect an Android device or start an emulator.
   Run the application from Android Studio.
2.Login:
  Enter your username and password on the login screen.
3.Navigate:
  After a successful login, you'll be taken to the dashboard where you can view a list of courses.
  Click on an item to see its detailed view.

#API Endpoints

Login: POST /sydney/auth - Authenticates a user and returns a keypass.
Dashboard: GET /dashboard/course - Retrieves a list of entities for the dashboard.

#Testing

Unit Tests
Unit tests are provided to ensure the correctness of various components, including:
  API Service: Tests API calls and responses.
  ViewModel: Tests ViewModel logic and state management.
  
To run unit tests, use the following command: ./gradlew test
