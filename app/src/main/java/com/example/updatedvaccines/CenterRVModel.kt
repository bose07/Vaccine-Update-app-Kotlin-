package com.example.updatedvaccines

data class CenterRVModel (

    val centerName: String,
    val centerAddress: String,
    val centerFromTime: String,
    val centerToTime: String,
    val fee_type: String,
    val ageLimit: Int,
    val vaccineName:String,
    val avaliableCapacity: Int
)
