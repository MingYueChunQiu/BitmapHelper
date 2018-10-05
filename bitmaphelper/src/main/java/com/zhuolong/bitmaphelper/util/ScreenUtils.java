package com.zhuolong.bitmaphelper.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/**
 * <pre>
 *     author : xyj
 *     e-mail : yujie.xi@ehailuo.com
 *     time   : 2018/03/27
 *     desc   : 屏幕相关的工具类
 *     version: 1.0
 * </pre>
 */

public class ScreenUtils {

    /**
     * 将dp转换为px
     *
     * @param resources
     * @param dpVal     dp值
     * @return 返回px值
     */
    public static float getPxFromDp(Resources resources, float dpVal) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, resources.getDisplayMetrics());
    }
}
