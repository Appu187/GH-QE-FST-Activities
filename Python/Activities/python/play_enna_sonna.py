import os
import time
import webbrowser
import pygame

# === CONFIGURE THESE ===
LOCAL_FILE = "enna_sonna.mp3"  # Put your legally obtained audio file here
STREAM_URL = "https://YOUR_LEGAL_STREAMING_LINK_HERE"  # e.g., the official YouTube/Spotify link

def play_local(file_path: str) -> None:
    """Play a local audio file using pygame.mixer."""
    pygame.mixer.init()  # Initializes audio system
    try:
        pygame.mixer.music.load(file_path)
        pygame.mixer.music.play()
        print(f"▶️  Playing: {file_path}")
        print("   Controls: Press Ctrl+C to stop early.")
        # Wait until playback finishes
        while pygame.mixer.music.get_busy():
            time.sleep(0.2)
    finally:
        pygame.mixer.music.stop()
        pygame.mixer.quit()

def open_stream(url: str) -> None:
    """Open a legal streaming URL in the default browser."""
    print("🌐 Local file not found. Opening your streaming link in the default browser...")
    webbrowser.open(url, new=2)  # new=2 tries to open in a new tab

def main():
    here = os.path.dirname(os.path.abspath(__file__))
    file_path = os.path.join(here, LOCAL_FILE)

    if os.path.isfile(file_path):
        try:
            play_local(file_path)
        except KeyboardInterrupt:
            print("\n⏹️  Stopped by user.")
        except Exception as e:
            print(f"⚠️  Could not play local file: {e}")
            if STREAM_URL and STREAM_URL.startswith("http"):
                open_stream(STREAM_URL)
            else:
                print("💡 Tip: Set STREAM_URL to a legal link (YouTube/Spotify/Apple Music).")
    else:
        if STREAM_URL and STREAM_URL.startswith("http"):
            open_stream(STREAM_URL)
        else:
            print(f"❗ Local file '{LOCAL_FILE}' not found and STREAM_URL is not set.")
            print("   Place your audio file next to this script or set STREAM_URL to a legal link.")

if __name__ == "__main__":
    main()