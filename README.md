# JavaFX Music Player - Bayaan Edition

A simple yet elegant desktop music player built with JavaFX, featuring soulful tracks from the Pakistani band **Bayaan**. This project demonstrates core JavaFX concepts including FXML, MediaPlayer API, custom CSS styling, and real-time audio controls.

---

## Demo Video

Watch the complete walkthrough and functionality demonstration:

**LinkedIn Demo:**
https://www.linkedin.com/embed/feed/update/urn:li:ugcPost:7475144785696112640?compact=1

---

## Features

- **Play/Pause** – Start and pause your music
- **Next/Previous** – Navigate through your playlist
- **Reset** – Jump back to the beginning of the current track
- **Volume Control** – Smooth slider for precise volume adjustment
- **Speed Control** – Adjust playback speed from 0.25× to 2.0×
- **Progress Bar** – Visual track progress with real-time updates
- **Modern UI** – Clean dark theme with gradient accents and smooth interactions

---

## Included Songs (Bayaan)

All tracks are included in the `src/main/resources/music/` directory:

1. **Din Dhalay** — `Din Dhalay.m4a`
2. **Farda** — `Farda.m4a`
3. **Kahan Jaoon** — `Kahan Jaoon.m4a`
4. **Maand** — `Maand.m4a`
5. **Nahin Milta** — `Nahin Milta.m4a`
6. **Safar** — `Safar.m4a`
7. **Tere Naal** — `Tere Naal.m4a`
8. **Teri Tasveer** — `Teri Tasveer.m4a`
9. **Tou Kya Hua** — `Tou Kya Hua.m4a`

---

## Technologies Used

| Technology          | Purpose                                  |
| ------------------- | ---------------------------------------- |
| **JavaFX 21**       | UI framework and application development |
| **FXML**            | XML-based UI layout design               |
| **CSS**             | Custom styling and theming               |
| **MediaPlayer API** | Audio playback and controls              |
| **Maven**           | Project management and build automation  |
| **Scene Builder**   | Visual UI design tool                    |

---

## Project Structure

```text
music-player/
├── src
│   └── main
│       ├── java
│       │   ├── javafx
│       │   │   └── musicplayer
│       │   │       ├── Application.java      # JavaFX application entry point
│       │   │       ├── Launcher.java         # Main launcher class
│       │   │       └── mp3Controller.java    # Controller logic
│       │   └── module-info.java              # Module dependencies
│       └── resources
│           ├── music
│           │   ├── Din Dhalay.m4a
│           │   ├── Farda.m4a
│           │   ├── Kahan Jaoon.m4a
│           │   ├── Maand.m4a
│           │   ├── Nahin Milta.m4a
│           │   ├── Safar.m4a
│           │   ├── Tere Naal.m4a
│           │   ├── Teri Tasveer.m4a
│           │   └── Tou Kya Hua.m4a
│           ├── mp3Player.fxml                # UI layout
│           └── style.css                     # Custom styling
├── music-player.exe
├── music-player.jar
├── mvnw
├── mvnw.cmd
└── pom.xml
```

---

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+ (or use the included Maven Wrapper)
- IntelliJ IDEA, Eclipse, or VS Code (optional)

### Installation

#### 1. Clone the Repository

```bash
git clone https://github.com/anasqadri-dev/mp3-player-javafx.git
cd music-player
```

#### 2. Build the Project

```bash
./mvnw clean compile
```

#### 3. Run the Application

```bash
./mvnw javafx:run
```

---

## Running the Packaged Application

### JAR File

```bash
java -jar music-player.jar
```

Or simply double-click the JAR file.

### Windows Executable

Double-click:

```text
music-player.exe
```

---

## How to Use

1. Launch the application.
2. The first song in the playlist loads automatically.
3. Use **Play/Pause** to control playback.
4. Click **Next** or **Previous** to switch tracks.
5. Adjust volume using the volume slider.
6. Select a playback speed from the dropdown menu.
7. Press **Reset** to restart the current track.
8. Track progress updates automatically through the progress bar.

---

## Learning Outcomes

This project helped me strengthen my understanding of:

- JavaFX FXML and Scene Builder
- MediaPlayer API for audio playback
- Multi-threading with Timer and TimerTask
- JavaFX CSS styling
- Progress synchronization with media playback
- Event handling and property listeners
- Maven project structure and build automation
- Java Module System (`module-info.java`)

---

## License

This project is open source and available under the **MIT License**.

---

## Author

**Your Name**

- GitHub: `https://github.com/anasqadri-dev`
- LinkedIn: `www.linkedin.com/in/anasqadri-dev`
- X (Twitter): `https://x.com/anasqadri_dev`

---

## Show Your Support

If you found this project useful or interesting, consider giving it a **⭐ on GitHub**.

<div align="center">
  <sub>Built with ❤️ using JavaFX</sub>
</div>

---
