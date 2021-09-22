package br.com.schumaker.webflux.service

import br.com.schumaker.webflux.model.ToDo
import br.com.schumaker.webflux.model.TodoRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
class TodoServiceImpl(private val repository: TodoRepository): TodoService {

    override fun findAll(): Flux<ToDo> {
        return repository.findAll()

    }

    override fun findById(id: String): Mono<ToDo> {
        return repository.findById(id)
    }
}