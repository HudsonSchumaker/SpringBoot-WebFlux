package br.com.schumaker.webflux

import br.com.schumaker.webflux.model.ToDo
import br.com.schumaker.webflux.model.TodoRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

/**
 *
 * @author hudson.schumaker
 */
@SpringBootApplication
class WebfluxApplication {
	@Bean
	fun run(repository: TodoRepository) = CommandLineRunner {

		repository.save(
			ToDo("Create an app")
		).subscribe()

		repository.save(
			ToDo("Test an app")
		).subscribe()
	}
}

fun main(args: Array<String>) {
	runApplication<WebfluxApplication>(*args)
}
