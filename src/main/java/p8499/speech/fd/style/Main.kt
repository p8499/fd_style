package p8499.speech.fd.style

import p8499.style.core.ARGB
import p8499.style.core.Dimension
import p8499.style.core.Environment
import p8499.style.core.Style

/**
 * Created by jdeuser on 2019/2/6.
 */
fun main(args: Array<String>) {
    fd()
}

fun fd() {
    Environment.create("sales").apply {
        search()

    }.print()

}

fun Environment.search() {
    addStyle("search", {
        it.addItem(Style.ANDROID_LAYOUT_WIDTH, "match_parent")
        it.addItem(Style.ANDROID_LAYOUT_HEIGHT, "wrap_content")
        it.addItem(Style.ANDROID_INPUTTYPE, "text")
        it.addItem(Style.ANDROID_IMEOPTIONS, "actionSearch")
        it.addItem(Style.ANDROID_TEXTSIZE, Dimension.TEXTSIZE_I)
        it.addItem(Style.ANDROID_TEXTCOLOR, ARGB.GREY_900.toString())
    })
}