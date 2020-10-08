package com.github.aerialist7

import org.kodein.di.DI
import org.kodein.di.instance
import org.w3c.dom.HTMLElement

@Suppress("FunctionName", "unused")
fun HelloWorld(): HTMLElement {
    val factory by di().instance<ComponentFactory<HTMLElement>>()
    return factory.create()
}

private fun di() = DI {
//    import(apiModule<HTMLElement>())
    import(apiModule2())
}