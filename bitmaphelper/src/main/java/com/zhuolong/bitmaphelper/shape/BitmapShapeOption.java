package com.zhuolong.bitmaphelper.shape;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/5
 *     desc   : 画笔形状额外选项类
 *     version: 1.0
 * </pre>
 */
public class BitmapShapeOption {

    private int mStrokeWidth;//画笔线宽
    private int mStrokeColor;//画笔线颜色

    public BitmapShapeOption() {
    }

    public BitmapShapeOption(Builder builder) {
        if (builder == null) {
            return;
        }
        mStrokeWidth = builder.strokeWidth;
        mStrokeColor = builder.strokeColor;
    }

    public int getStrokeWidth() {
        return mStrokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        mStrokeWidth = strokeWidth;
    }

    public int getStrokeColor() {
        return mStrokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        mStrokeColor = strokeColor;
    }

    public static class Builder {
        private int strokeWidth;//画笔线宽
        private int strokeColor;//画笔线颜色

        public BitmapShapeOption build() {
            return new BitmapShapeOption(this);
        }

        public int getStrokeWidth() {
            return strokeWidth;
        }

        public Builder setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            return this;
        }

        public int getStrokeColor() {
            return strokeColor;
        }

        public Builder setStrokeColor(int strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }
    }
}
