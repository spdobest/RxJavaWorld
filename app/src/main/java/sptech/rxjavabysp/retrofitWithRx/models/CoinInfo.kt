package sptech.rxjavabysp.retrofitWithRx.models

data class CoinInfo(
        val Algorithm: String,
        val BlockNumber: Int,
        val BlockReward: Int,
        val BlockTime: Int,
        val DocumentType: String,
        val FullName: String,
        val Id: String,
        val ImageUrl: String,
        val Internal: String,
        val Name: String,
        val NetHashesPerSecond: Int,
        val ProofType: String,
        val Type: Int,
        val Url: String
)