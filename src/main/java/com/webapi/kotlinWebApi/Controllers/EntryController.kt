package com.webapi.kotlinWebApi.Controllers

import com.webapi.kotlinWebApi.Models.BlogEntry
import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/entries")
class EntryController {
    val counter = AtomicLong()

    @GetMapping
    fun getEntries() =
           BlogEntry(counter.incrementAndGet(), "TestMessage")

    @PostMapping
    fun postEntry(@RequestBody entry: BlogEntry) {
    println(entry)
    }
}