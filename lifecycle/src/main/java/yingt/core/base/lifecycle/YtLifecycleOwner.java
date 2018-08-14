package yingt.core.base.lifecycle;

import android.support.annotation.NonNull;


public interface YtLifecycleOwner {
    @NonNull
    YtLifecycle getYtLifecycle();
}
