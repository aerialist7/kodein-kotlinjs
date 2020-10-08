package com.github.aerialist7

import org.kodein.di.DI.Module
import org.kodein.di.bind
import org.kodein.di.singleton
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
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

fun apiModule2() = Module(
    name = "api",
    prefix = "aerialist7"
) {
    val element = document
        .createElement("div")
        .unsafeCast<HTMLElement>()
        .apply { textContent = "Hello, World!" }

    bind<ComponentFactory<HTMLElement>>() with singleton {
        SimpleComponentFactory(element)
    }
}