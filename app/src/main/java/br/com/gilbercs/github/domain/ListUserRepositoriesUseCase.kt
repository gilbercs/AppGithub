package br.com.gilbercs.github.domain


import br.com.gilbercs.github.app.github.data.model.Repo
import br.com.gilbercs.github.core.UseCase
import br.com.gilbercs.github.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}