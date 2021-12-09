package br.com.schumaker.webflux.service

import br.com.schumaker.webflux.model.ToDo
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 *
 * @author hudson schumaker
 */
interface TodoService {

    fun findAll(): Flux<ToDo>
    fun findById(id: String): Mono<ToDo>
}
