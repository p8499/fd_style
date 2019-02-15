package p8499.speech.fd.style

import p8499.style.*
import p8499.style.color.*
import p8499.style.drawable.LayerList
import p8499.style.drawable.drawable
import p8499.style.drawable.layer
import p8499.style.drawable.rectangle

val collapsing = Style("collapsing") +
        width_full +
        height_1 +
        contentScrim(transparent.styleItem()) +
        layout_scrollFlags("scroll|enterAlways|snap".styleItem())
val body = Style("body") +
        full +
        android_fillViewport(true.styleItem()) +
        layout_behavior("@string/appbar_scrolling_view_behavior".styleItem())

val image = Style("image") +
        android_scaleType("centerCrop".styleItem()) +
        android_contentDescription(null.styleItem())
val image_16 = image.clone("image_16") +
        android_layout_width(16.dp.styleItem()) +
        android_layout_height(16.dp.styleItem())
val image_32 = image.clone("image_32") +
        android_layout_width(32.dp.styleItem()) +
        android_layout_height(32.dp.styleItem())
val image_64 = image.clone("image_64") +
        android_layout_width(64.dp.styleItem()) +
        android_layout_height(64.dp.styleItem())
val text_main = Style("text_main") +
        wrap +
        android_textSize(14.sp.styleItem()) +
        android_textColor(black.styleItem())
val text_assist = Style("text_assist") +
        wrap +
        android_textSize(12.sp.styleItem()) +
        android_textColor(grey_600.styleItem())

val tag = Style("tag") +
        padding_horizontal(8.dp) +
        padding_vertical(4.dp) +
        android_background(mapOf(
                state_selected.condition() to rectangle().also { it.radius(8.dp); it.backgroundColor = grey_400 }.build().drawable(),
                emptyCondition to rectangle().also { it.radius(8.dp); it.backgroundColor = transparent }.build().drawable()).selector("bg"))
val tagt = Style("tagt") +
        wrap +
        vertical_center +
        android_textSize(12.dp.styleItem()) +
        android_textColor(mapOf(
                state_selected.condition() to white,
                emptyCondition to black).selector("tc"))
val tagc = Style("tagc") +
        android_layout_marginStart(8.dp.styleItem()) +
        vertical_center +
        image_16 +
        android_src("@drawable/ic_close_grey_24dp".styleItem())

val search = Style("search") +
        width_full +
        android_layout_height(36.dp.styleItem()) +
        padding_horizontal(12.dp) +
        android_hint(null.styleItem()) +
        android_inputType("text".styleItem()) +
        android_imeOptions("actionSearch".styleItem()) +
        android_singleLine(true.styleItem()) +
        android_textSize(14.sp.styleItem()) +
        android_textColor(grey_900.styleItem()) +
        android_background(mapOf(
                emptyCondition to (LayerList() + rectangle().build().layer()).drawable()).selector("bg"))

val error = Style("error") +
        wrap +
        center +
        android_clickable(true.styleItem()) +
        android_focusable(true.styleItem()) +
        android_textSize(14.sp.styleItem()) +
        android_drawableTop("@drawable/ic_error_grey_32dp".styleItem())

val appStyles = listOf(
        collapsing,
        body,
        image,
        image_16,
        image_32,
        image_64,
        text_main,
        text_assist,
        tag,
        tagt,
        tagc,
        search,
        error)