package fatec.padroesdeprojeto.io.marvelapp.data.model.character

import com.google.gson.annotations.SerializedName
import fatec.padroesdeprojeto.io.marvelapp.data.model.ThumbnailModel
import java.io.Serializable

data class CharacterModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
): Serializable