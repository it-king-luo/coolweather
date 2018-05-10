package coolweather.android.util;

public interface HttplCallbackListener {
    public interface HttpCallbackListener {
        void onFinish(String response);
        void onError(Exception e);
    }
}
