package fatec.padroesdeprojeto.io.marvelapp.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import fatec.padroesdeprojeto.io.marvelapp.databinding.FragmentDetailsCharacterBinding
import fatec.padroesdeprojeto.io.marvelapp.ui.base.BaseFragment

class DetailsCharacterFragment :
    BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>() {
    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding =
        FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}