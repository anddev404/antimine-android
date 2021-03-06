package dev.lucasnlm.antimine.common.level.models

import android.graphics.Paint
import android.graphics.RectF

data class AreaPaintSettings(
    val painter: Paint,
    val rectF: RectF,
    val radius: Float,
)
