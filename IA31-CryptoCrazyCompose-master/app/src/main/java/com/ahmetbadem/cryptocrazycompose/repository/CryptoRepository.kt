package com.ahmetbadem.cryptocrazycompose.repository

import com.ahmetbadem.cryptocrazycompose.model.Crypto
import com.ahmetbadem.cryptocrazycompose.model.CryptoList
import com.ahmetbadem.cryptocrazycompose.service.CryptoAPI
import com.ahmetbadem.cryptocrazycompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api: CryptoAPI
) {

    suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            api.getCryptoList()
        } catch(e: Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(): Resource<Crypto> {
        val response = try {
            api.getCrypto()
        } catch(e: Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}