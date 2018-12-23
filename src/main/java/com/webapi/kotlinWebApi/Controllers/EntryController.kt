package com.webapi.kotlinWebApi.Controllers

import com.webapi.kotlinWebApi.Models.BlogEntry
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class EntryController {
    val counter = AtomicLong()

    @GetMapping("/entries")
    fun getEntries() =
           BlogEntry(counter.incrementAndGet(), "TestMessage")
}