package p8499.speech.fd.style

import p8499.style.*

val full = Style("full") +
        width_full() +
        height_full()
val wrap = Style("wrap") +
        width_wrap() +
        height_wrap()

val width_full = Style("width_full") +
        width_full() +
        height_wrap()

val height_full = Style("height_full") +
        width_wrap() +
        height_full()

fun vertical_top() = Style("vertical_top") +
        android_layout_gravity("top".styleItem())

fun vertical_center() = Style("vertical_center") +
        android_layout_gravity("center_vertical".styleItem())

fun vertical_bottom() = Style("vertical_bottom") +
        android_layout_gravity("bottom".styleItem())

fun horizontal_start() = Style("horizontal_start") +
        android_layout_gravity("start".styleItem()) +
        android_layout_gravity("left".styleItem())

fun horizontal_center() = Style("horizontal_center") +
        android_layout_gravity("center_horizontal".styleItem())

fun horizontal_end() = Style("horizontal_end") +
        android_layout_gravity("end".styleItem()) +
        android_layout_gravity("right".styleItem())

fun top_start() = Style("top_start") +
        vertical_top() +
        horizontal_start()

fun top() = Style("top") +
        vertical_top() +
        horizontal_center()

fun top_end() = Style("top_end") +
        vertical_top() +
        horizontal_end()

fun start() = Style("start") +
        vertical_center() +
        horizontal_start()

fun center() = Style("center") +
        vertical_center() +
        horizontal_center()

fun end() = Style("end") +
        vertical_center() +
        horizontal_end()

fun bottom_start() = Style("bottom_start") +
        vertical_bottom() +
        horizontal_start()

fun bottom() = Style("bottom") +
        vertical_bottom() +
        horizontal_center()

fun bottom_end() = Style("bottom_end") +
        vertical_bottom() +
        horizontal_end()

fun width(dp: String) = Style("width_$dp") +
        android_layout_width(dp.styleItem())

fun height(dp: String) = Style("height_$dp") +
        android_layout_height(dp.styleItem())

fun width_full() = Style("width_full") +
        width("match_parent")

fun height_full() = Style("height_full") +
        height("match_parent")

fun width_wrap() = Style("width_wrap") +
        width("wrap_content")

fun height_wrap() = Style("height_wrap") +
        height("wrap_content")

fun height_1() = Style("height_1") +
        height(0.dp) +
        android_layout_weight(1.styleItem())

fun width_1() = Style("width_1") +
        width(0.dp) +
        android_layout_weight(1.styleItem())

fun padding_start(dp: String) = Style("padding_start_$dp") +
        android_paddingStart(dp.styleItem()) +
        android_paddingLeft(dp.styleItem())

fun padding_end(dp: String) = Style("padding_end_$dp") +
        android_paddingEnd(dp.styleItem()) +
        android_paddingRight(dp.styleItem())

fun padding_horizontal(dp: String) = Style("padding_horizontal_$dp") +
        padding_start(dp) +
        padding_end(dp)

fun padding_vertical(dp: String) = Style("padding_vertical_$dp") +
        android_paddingTop(dp.styleItem()) +
        android_paddingBottom(dp.styleItem())

fun padding(dp: String) = Style("padding_$dp") +
        padding_horizontal(dp) +
        padding_vertical(dp)

fun margin_start(dp: String) = Style("margin_start_$dp") +
        android_layout_marginStart(dp.styleItem()) +
        android_layout_marginLeft(dp.styleItem())

fun margin_end(dp: String) = Style("margin_end_$dp") +
        android_layout_marginEnd(dp.styleItem()) +
        android_layout_marginRight(dp.styleItem())

fun margin_horizontal(dp: String) = Style("margin_horizontal_$dp") +
        margin_start(dp) +
        margin_end(dp)

fun margin_vertical(dp: String) = Style("margin_vertical_$dp") +
        android_layout_marginTop(dp.styleItem()) +
        android_layout_marginBottom(dp.styleItem())

fun margin(dp: String) = Style("margin_$dp") +
        margin_horizontal(dp) +
        margin_vertical(dp)

val styles = listOf(
        full,
        wrap,
        width_full,
        height_full)