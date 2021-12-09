package br.com.schumaker.webflux.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*

/**
 *
 * @author hudson schumaker
 */
@Document
class ToDo {

    @Id
    var id: String? = null
    var description: String = ""
    var created: LocalDateTime = LocalDateTime.now()
    var modified: LocalDateTime = LocalDateTime.now()
    var completed: Boolean = false

    constructor() {
    }

    constructor(description: String) {
        this.id = UUID.randomUUID().toString()
        this.description = description
    }

    constructor(description: String, completed: Boolean) {
        this.id = UUID.randomUUID().toString()
        this.description = description
        this.completed = completed
    }
}
