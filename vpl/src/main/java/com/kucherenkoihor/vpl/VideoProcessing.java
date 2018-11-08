package com.kucherenkoihor.vpl;

/**
 * Created by ihor_kucherenko on 8/25/17.
 * https://github.com/KucherenkoIhor
 */

public class VideoProcessing {

    static {
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-55");
        System.loadLibrary("vpl");
    }

    public native int getDuration(String input) throws Exception;

    public native void remux(String input, String output) throws Exception;

    public native void mergeAudioWithVideoWithoutTranscoding(String inputV, String inputA, String output) throws Exception;

    public native void trim(String input, String output, double start, double end) throws Exception;

    public native void rotateDisplayMatrix(String input, String output, double rotation) throws Exception;

    public native void speedOfVideo(String input, String output, int coefficient) throws Exception;
}
