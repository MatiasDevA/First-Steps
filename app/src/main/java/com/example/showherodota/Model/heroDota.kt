package com.example.showherodota.Model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class heroDota (
  @DrawableRes  val imageResourceId: Int,
  val name: String,
  val attribute: String,
  @StringRes val stringResourceId: Int)