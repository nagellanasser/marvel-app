package fatec.padroesdeprojeto.io.marvelapp.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import fatec.padroesdeprojeto.io.marvelapp.databinding.FragmentListCharacterBinding
import fatec.padroesdeprojeto.io.marvelapp.ui.base.BaseFragment

@AndroidEntryPoint
class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>() {

    override val viewModel: ListCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding =
        FragmentListCharacterBinding.inflate(inflater, container, false)
}