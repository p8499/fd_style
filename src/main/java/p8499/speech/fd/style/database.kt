package p8499.speech.fd.style

import p8499.style.Style
import p8499.style.android_orientation
import p8499.style.dp
import p8499.style.styleItem

val database_leading = Style("database_leading") +
        wrap +
        padding_start(8.dp) +
        padding_end(4.dp) +
        padding_vertical(4.dp)

val database_content = Style("database_content") +
        full +
        android_orientation("vertical".styleItem()) +
        padding_start(4.dp) +
        padding_end(8.dp) +
        padding_vertical(4.dp)

val database_content_row = Style("database_content_row") +
        width_full() +
        height_1() +
        android_orientation("horizontal".styleItem())

val database_portrait = Style("database_portrait") +
        image_64

val database_name = Style("database_name") +
        text_main +
        width_1() +
        vertical_center()

val database_icon = Style("database_icon") +
        image_16 +
        vertical_center() +
        margin_start(4.dp)

val database_progress = Style("@android:style/Widget.ProgressBar.Horizontal", "database_progress") +
        width_1() +
        height(10.dp) +
        vertical_center() +
        ("android:progressDrawable" to "@drawable/iv_progress".styleItem())

val database_percent = Style("database_percent") +
        text_assist +
        vertical_center() +
        margin_start(4.dp)

val databaseStyles = listOf(
        database_leading,
        database_content,
        database_content_row,
        database_portrait,
        database_name,
        database_icon,
        database_progress,
        database_percent)