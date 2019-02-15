package p8499.speech.fd.style

import p8499.style.Environment

fun main(args: Array<String>) = fd()

fun fd() = println(Environment("fd", styles + appStyles + databaseStyles).print())