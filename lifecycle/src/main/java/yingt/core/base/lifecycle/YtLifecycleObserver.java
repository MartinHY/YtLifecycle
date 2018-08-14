package yingt.core.base.lifecycle;

import io.reactivex.observers.DisposableObserver;

@SuppressWarnings("WeakerAccess")
public abstract class YtLifecycleObserver extends DisposableObserver<String> {

    @Override
    public void onNext(String lifecycle) {
        switch (lifecycle){
            case Lifecycle.ON_CREATE:
                onCreat();
                break;
            case Lifecycle.ON_DESTROY:
                onDestory();
                break;
            case Lifecycle.ON_PAUSE:
                onPause();
                break;
            case Lifecycle.ON_RESUME:
                onResume();
                break;
        }
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }

    /**
     * 对应生命周期 ON_CREATE , 用于初始化数据等
     */
    protected abstract void onCreat();

    /**
     * 对应生命周期 ON_RESUME , 用于前台自动刷新操作
     */
    protected abstract void onResume();

    /**
     * 对应生命周期 ON_PAUSE , 用于打断当前持续性操作
     */
    protected abstract void onPause();

    /**
     * 对应生命周期 ON_DESTROY , 用于释放内存
     */
    protected abstract void onDestory();


}
