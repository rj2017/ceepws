package com.example.ceepws

import org.graalvm.compiler.hotspot.stubs.StubUtil.printf
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CeepwsApplication

fun main(args: Array<String>) {

	runApplication<CeepwsApplication>(*args)
}
