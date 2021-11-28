package fatec.padroesdeprojeto.io.marvelapp.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import fatec.padroesdeprojeto.io.marvelapp.databinding.FragmentSearchCharacterBinding
import fatec.padroesdeprojeto.io.marvelapp.ui.base.BaseFragment

class SearchCharacterFragment :
    BaseFragment<FragmentSearchCharacterBinding, SearchCharacterViewModel>() {

    override val viewModel: SearchCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchCharacterBinding =
        FragmentSearchCharacterBinding.inflate(inflater, container, false)
}