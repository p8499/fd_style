package p8499.speech.fd.style

import p8499.style.Environment
import java.io.File

fun main(args: Array<String>) = fd()

fun fd() = println(Environment("fd", styles + appStyles + databaseStyles).print(File("C:${File.separator}AndroidStudioProjects${File.separator}fd${File.separator}app${File.separator}src${File.separator}main${File.separator}res")))