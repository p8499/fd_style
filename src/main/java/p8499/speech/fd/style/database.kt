package p8499.speech.fd.style

import p8499.style.Style
import p8499.style.android_orientation
import p8499.style.dp
import p8499.style.styleItem

val database_leading = Style("database_leading") +
        wrap +
        padding(4.dp)

val database_content = Style("database_content") +
        full +
        android_orientation("vertical".styleItem())

val database_content_row = Style("database_content_row") +
        width_full +
        height_1 +
        android_orientation("horizontal".styleItem()) +
        padding(4.dp)

val database_portrait = Style("database_portrait") +
        image_64

val database_name = Style("database_name") +
        text_main +
        width_1 +
        height_full

val database_icon = Style("database_icon") +
        image_16 +
        vertical_center

val databaseStyles = listOf(
        database_leading,
        database_content,
        database_content_row,
        database_portrait,
        database_name,
        database_icon)