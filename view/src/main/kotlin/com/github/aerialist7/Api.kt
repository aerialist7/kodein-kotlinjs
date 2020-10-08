package com.github.aerialist7

import org.kodein.di.Kodein
import org.kodein.di.erased.instance
import org.w3c.dom.HTMLElement

@Suppress("FunctionName", "unused")
fun HelloWorld(): HTMLElement {
    val factory by di().instance<ComponentFactory<HTMLElement>>()
    return factory.create()
}

private fun di() = Kodein {
    import(apiModule<HTMLElement>()) // works!
}