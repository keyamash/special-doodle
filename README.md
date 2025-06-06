# Text Image Search Android App

This is a simple example Android application that allows searching photos stored on the device using text input. It uses a lightweight CLIP model converted to TensorFlow Lite to run entirely on-device.

## Features
- Index photos from the device and store embeddings
- Search photos by text input using the same CLIP model
- No network usage required

## Building
1. Open the project in Android Studio.
2. Put your TFLite CLIP model file in `app/src/main/assets/clip.tflite`.
3. Build and run on an Android device.

## Notes
This example omits error handling and uses a tiny dataset for demonstration. You may need to optimize memory usage and consider incremental indexing for large photo libraries.
