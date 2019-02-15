package p8499.speech.fd.style

import p8499.style.*
import p8499.style.color.*
import p8499.style.drawable.LayerList
import p8499.style.drawable.drawable
import p8499.style.drawable.layer
import p8499.style.drawable.rectangle

val head = Style("head") +
        width_full() +
        height_wrap()
val collapsing = Style("collapsing") +
        width_full() +
        height_1() +
        contentScrim(transparent.styleItem()) +
        layout_scrollFlags("scroll|enterAlways|snap".styleItem())
val toolbar = Style("toolbar") +
        width_full() +
        height_wrap() +
        android_orientation("vertical".styleItem())
val body = Style("body") +
        full +
        android_fillViewport(true.styleItem()) +
        layout_behavior("@string/appbar_scrolling_view_behavior".styleItem())

val image = Style("image") +
        android_scaleType("centerCrop".styleItem()) +
        android_contentDescription(null.styleItem())
val image_16 = image.clone("image_16") +
        width(16.dp) +
        height(16.dp)
val image_32 = image.clone("image_32") +
        width(32.dp) +
        height(32.dp)
val image_64 = image.clone("image_64") +
        width(64.dp) +
        height(64.dp)
val text_main = Style("text_main") +
        wrap +
        android_textSize(16.sp.styleItem()) +
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
        vertical_center() +
        android_textSize(12.sp.styleItem()) +
        android_textColor(mapOf(
                state_selected.condition() to white,
                emptyCondition to black).selector("tc"))
val tagc = Style("tagc") +
        android_layout_marginStart(8.dp.styleItem()) +
        vertical_center() +
        image_16 +
        android_src("@drawable/ic_close_grey_24dp".styleItem())

val search = Style("search") +
        width_full() +
        height(36.dp) +
        padding_horizontal(12.dp) +
        android_hint(null.styleItem()) +
        android_inputType("text".styleItem()) +
        android_imeOptions("actionSearch".styleItem()) +
        android_singleLine(true.styleItem()) +
        android_textSize(16.sp.styleItem()) +
        android_textColor(grey_900.styleItem()) +
        android_background(mapOf(
                emptyCondition to (LayerList() + rectangle().build().layer()).drawable()).selector("bg"))

val loading = Style("loading") +
        wrap +
        center()

val error = Style("error") +
        wrap +
        center() +
        android_clickable(true.styleItem()) +
        android_focusable(true.styleItem()) +
        android_textSize(16.sp.styleItem()) +
        android_drawableTop("@drawable/ic_error_grey_32dp".styleItem())

val appStyles = listOf(
        head,
        collapsing,
        toolbar,
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
        loading,
        error)