package p8499.speech.fd.style

import p8499.style.*

val width_full = Style("width_full") +
        android_layout_width("match_parent".styleItem())
val height_full = Style("width_full") +
        android_layout_height("match_parent".styleItem())
val width_wrap = Style("width_wrap") +
        android_layout_width("wrap_content".styleItem())
val height_wrap = Style("width_wrap") +
        android_layout_height("wrap_content".styleItem())
val full = Style("full") +
        width_full +
        height_full
val wrap = Style("wrap") +
        width_wrap +
        height_wrap
val height_1 = Style("row_free") +
        android_layout_height(0.dp.styleItem()) +
        android_layout_weight(0.styleItem())
val width_1 = Style("column_1") +
        android_layout_width(0.dp.styleItem()) +
        android_layout_weight(0.styleItem())

val vertical_top = Style("vertical_top") +
        android_layout_gravity("top".styleItem())
val vertical_center = Style("vertical_center") +
        android_layout_gravity("center_vertical".styleItem())
val vertical_bottom = Style("vertical_bottom") +
        android_layout_gravity("bottom".styleItem())
val horizontal_start = Style("horizontal_start") +
        android_layout_gravity("start".styleItem()) +
        android_layout_gravity("left".styleItem())
val horizontal_center = Style("horizontal_center") +
        android_layout_gravity("center_horizontal".styleItem())
val horizontal_end = Style("horizontal_end") +
        android_layout_gravity("end".styleItem()) +
        android_layout_gravity("right".styleItem())
val top_start = Style("top_start") +
        vertical_top +
        horizontal_start
val top = Style("top") +
        vertical_top +
        horizontal_center
val top_end = Style("top_end") +
        vertical_top +
        horizontal_end
val start = Style("start") +
        vertical_center +
        horizontal_start
val center = Style("center") +
        vertical_center +
        horizontal_center
val end = Style("end") +
        vertical_center +
        horizontal_end
val bottom_start = Style("bottom_start") +
        vertical_bottom +
        horizontal_start
val bottom = Style("bottom") +
        vertical_bottom +
        horizontal_center
val bottom_end = Style("bottom_end") +
        vertical_bottom +
        horizontal_end

fun padding_horizontal(dp: String) = Style("padding_horizontal_$dp") +
        android_paddingStart(dp.styleItem()) +
        android_paddingEnd(dp.styleItem()) +
        android_paddingLeft(dp.styleItem()) +
        android_paddingRight(dp.styleItem())

fun padding_vertical(dp: String) = Style("padding_vertical_$dp") +
        android_paddingTop(dp.styleItem()) +
        android_paddingBottom(dp.styleItem())

fun padding(dp: String) = Style("padding_$dp") +
        padding_horizontal(dp) +
        padding_vertical(dp)

val styles = listOf(
        width_full,
        height_full,
        width_wrap,
        height_wrap,
        full,
        wrap,
        height_1,
        width_1,
        vertical_top,
        vertical_center,
        vertical_bottom,
        horizontal_start,
        horizontal_center,
        horizontal_end,
        top_start,
        top,
        top_end,
        start,
        center,
        end,
        bottom_start,
        bottom,
        bottom_end)