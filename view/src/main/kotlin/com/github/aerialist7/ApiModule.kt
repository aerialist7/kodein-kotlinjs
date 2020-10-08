package com.github.aerialist7

import org.kodein.di.Kodein.Module
import org.kodein.di.erased.bind
import org.kodein.di.erased.singleton
import org.w3c.dom.Element
import kotlin.browser.document

fun <T : Element> apiModule() = Module(
    name = "api",
    prefix = "aerialist7"
) {
    val element = document
        .createElement("div")
        .unsafeCast<T>()
        .apply { textContent = "Hello, World!" }

    bind<ComponentFactory<T>>() with singleton {
        SimpleComponentFactory(element)
    }
}