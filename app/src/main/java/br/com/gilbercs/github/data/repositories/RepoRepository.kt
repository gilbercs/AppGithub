package br.com.gilbercs.github.data.repositories


import br.com.gilbercs.github.app.github.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}