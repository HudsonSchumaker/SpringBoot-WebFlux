package br.com.schumaker.webflux.web

import br.com.schumaker.webflux.model.ToDo
import br.com.schumaker.webflux.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 *
 * @author hudson schumaker
 */
@RestController
@RequestMapping("/todo")
class ToDoController(private val service: TodoService) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): Mono<ToDo> {
        return service.findById(id)
    }

    @GetMapping("/")
    fun findAll(): Flux<ToDo> {
        return service.findAll()
    }
}
