package com.ahmetbadem.cryptocrazycompose.viewmodel

import androidx.lifecycle.ViewModel
import com.ahmetbadem.cryptocrazycompose.model.Crypto
import com.ahmetbadem.cryptocrazycompose.repository.CryptoRepository
import com.ahmetbadem.cryptocrazycompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(): Resource<Crypto> {
        return repository.getCrypto()
    }
}