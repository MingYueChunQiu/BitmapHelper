package com.zhuolong.bitmaphelper;

import android.support.annotation.NonNull;

import com.zhuolong.bitmaphelper.helper.BitmapShapeHelper;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/5
 *     desc   : 图片辅助处理工厂类
 *     version: 1.0
 * </pre>
 */
public class BitmapHelperFactory {

    @NonNull
    public static BitmapShapeHelper newBitmapShapeHelper() {
        return new BitmapShapeHelper();
    }
}
