package yingt.core.base.lifecycle;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;

import io.reactivex.subjects.BehaviorSubject;


public class YtLifecycle {

    private BehaviorSubject<String> subject;

    public YtLifecycle() {
        subject = BehaviorSubject.create();
    }

    @MainThread
    public void onNext(@Lifecycle String lifecycle) {
        subject.onNext(lifecycle);
        if (lifecycle.equals(Lifecycle.ON_DESTROY)) {
            subject.onComplete();
        }
    }

    @MainThread
    public void addObserver(@NonNull YtLifecycleObserver observer) {
        subject.subscribe(observer);
    }

    @MainThread
    public void removeObserver(@NonNull YtLifecycleObserver observer) {
        if (!observer.isDisposed())
            observer.dispose();
    }

}
