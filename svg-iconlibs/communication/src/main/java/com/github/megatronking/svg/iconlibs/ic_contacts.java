package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_contacts extends SVGRenderer {

    public ic_contacts(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(20.0f, 0.0f);
        mPath.lineTo(4.0f, 0.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.lineTo(20.0f, 0.0f);
        mPath.close();
        mPath.moveTo(20.0f, 0.0f);
        mPath.moveTo(4.0f, 24.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(4.0f, 22.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(4.0f, 24.0f);
        mPath.moveTo(20.0f, 4.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 4.0f);
        mPath.rMoveTo(-8.0f, 2.75f);
        mPath.rCubicTo(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        mPath.rCubicTo(0.0f, 1.2399998f, -1.01f, 2.25f, -2.25f, 2.25f);
        mPath.cubicTo(10.76f, 11.25f, 9.75f, 10.24f, 9.75f, 9.0f);
        mPath.cubicTo(9.75f, 7.76f, 10.76f, 6.75f, 12.0f, 6.75f);
        mPath.close();
        mPath.moveTo(12.0f, 6.75f);
        mPath.moveTo(17.0f, 17.0f);
        mPath.lineTo(7.0f, 17.0f);
        mPath.rLineTo(0f, -1.5f);
        mPath.rCubicTo(0.0f, -1.67f, 3.33f, -2.5f, 5.0f, -2.5f);
        mPath.rCubicTo(1.6700001f, 0.0f, 5.0f, 0.83f, 5.0f, 2.5f);
        mPath.lineTo(17.0f, 17.0f);
        mPath.close();
        mPath.moveTo(17.0f, 17.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}