package fatec.padroesdeprojeto.io.marvelapp.repository

import fatec.padroesdeprojeto.io.marvelapp.data.remote.ServiceApi
import javax.inject.Inject

class MarvelRepository @Inject constructor(private val api:ServiceApi) {
    suspend fun list(nameStartWith: String? = null) = api.list(nameStartWith)
    suspend fun getComics(characterId: Int) = api.getComics(characterId)
}