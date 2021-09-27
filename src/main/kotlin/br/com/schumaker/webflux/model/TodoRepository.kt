package br.com.schumaker.webflux.model

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author hudson.schumaker
 */
@Repository
interface TodoRepository: ReactiveMongoRepository<ToDo, String> {
}
