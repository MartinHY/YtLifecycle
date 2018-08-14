package yingt.core.base.lifecycle;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static yingt.core.base.lifecycle.Lifecycle.ON_CREATE;
import static yingt.core.base.lifecycle.Lifecycle.ON_DESTROY;
import static yingt.core.base.lifecycle.Lifecycle.ON_PAUSE;
import static yingt.core.base.lifecycle.Lifecycle.ON_RESUME;


@StringDef({ON_CREATE,ON_RESUME,ON_PAUSE,ON_DESTROY})
@Retention(RetentionPolicy.SOURCE)
public @interface Lifecycle {

    String ON_CREATE = "ON_CREATE";

    String ON_RESUME = "ON_RESUME";

    String ON_PAUSE = "ON_PAUSE";

    String ON_DESTROY = "ON_DESTROY";

}
