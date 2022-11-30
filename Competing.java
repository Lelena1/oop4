public interface Competing {
    String[] getAllPitStopActions();

    void doPitStop(String action);

    void showBestLapTime();

    void showMaxSpeed();
}
