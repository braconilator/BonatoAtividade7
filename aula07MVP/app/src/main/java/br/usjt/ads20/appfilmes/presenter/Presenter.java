package br.usjt.ads20.appfilmes.presenter;

public interface Presenter {
    void onCreate();

    void onStart();

    void onRestart();

    void onPause();

    void onResume();

    void onStop();

    void onDestroy();
}
