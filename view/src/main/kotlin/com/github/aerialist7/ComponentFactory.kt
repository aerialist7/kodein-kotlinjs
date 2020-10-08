package com.github.aerialist7

import org.w3c.dom.Element

interface ComponentFactory<T : Element> {
    fun create(): T
}

class SimpleComponentFactory<T : Element>(
    val element: T
) : ComponentFactory<T> {

    override fun create(): T = element

}